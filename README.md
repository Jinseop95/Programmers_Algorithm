# 프로그래머스 알고리즘 풀이

* 해결한 문제 수 : 35

## 함수 정리
- #### Arrays 클래스
    - **sort(array) : 배열 정렬(오름차순)**
    ``` java
    int [] arr = {2, 4, 9, 7, 5, 2};
    Arrays.sort(arr);   //출력결과  2 2 4 5 7 9
    ```
    - **sort(array, Comparator) : 내림차순 정렬(한글, 영문)**
    ``` java
    String[] arr = {"a", "b", "c", "d"};
    Arrays.sort(arr,Collections.reverseOrder());  //출력결과 d c b a 
    
    String[] str = {"11", "13", "23", "53", "223", "145", "53"};
    Arrays.sort(str,Collections.reverseOrder());  //출력결과 53 53 23 223 145 13 11
    // 다만 String타입일 경우, 숫자 자체를 인식하는 것이 아니다보니 무조건 첫번째 자리를 기준으로 내림차순 정렬
    ```
    - **2차원 행렬의 행, 열 크기 구하기**
    ``` java
    int[] arr = new int[3][4]; // 3행 4열
    System.out.println(arr.length);   //3행
    System.out.println(arr[0].length);  //4열
    ```
    
    - **copyOf(원본 배열, 복사할 길이) : 배열 복사**
    ``` java
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = Arrays.copyOf(arr1, 3); //출력결과 1 2 3
    int[] arr3 = Arrays.copyOf(arr1, 10); //출력결과 1 2 3 4 5 0 0 0 0 0 
    // 새로운 배열의 길이가 원본 배열보다 길면, 나머지 요소는 배열의 타입에 맞게 기본값으로 채워짐
    ```
    - **copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) :**  
    인덱스는 0부터 시작, 시작 인덱스는 포함, 끝 인덱스는 포함 X
    ``` java
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);    //출력결과 3 4
    ```
    
- #### ArrayList
    - **사용법**
    ``` java
    //생성
    ArrayList<Integer> numbers = new ArrayList<>();
    
    //추가
    numbers.add(10);
    numbers.add(20);
    numbers.add(1,50); 
    // 출력결과 10 50 20
    
    //삭제
    numbers.remove(1); // 출력결과 10 20
    numbers.remove((Integer)20); // 50
    
    //가져오기
    numbers.get(1); //출력결과 20
    ```
    
    - **contains(Object o) : 리스트에 객체가 존재하면 true 리턴**
    ``` java
    String[] fruitsArray = {"apple", "banana", "mango"};
    ArrayList<String> fruits = new ArrayList<>(Arrys.asList(fruitsArray));
    
    System.out.println(fruits.contains("apple")); // 출력결과 true
    System.out.println(fruits.contains("orange")); // 출력결과 false
    ```
    
    - **isEmpty() : ArrayList에 할당되어 있는 값 존재 여부**
    ``` java
    arrList.isEmpty();  //출력결과 True Or false
    ```
    
    - **sort(List) :**
    List 정렬
    ``` java
    List<String> str = Arrays.asList("A", "C", "B", "D");
    
    //오름차순 정렬
    Collections.sort(str);    //[A,B,C,D]
    //내림차순 정렬
    Collections.sort(str, Collections.reverseOrder());    //[D, C, B, A]  
    ```
    
    - **min(List) : Collections 클래스의 min() 이용, 리스트에서 최소값**
    - **max(List) : Collections 클래스의 max() 이용, 리스트에서 최대값**
    ``` java
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    int min = list.isEmpty() ? -1 : Collections.max(list);
    //리스트가 비어있을 경우 예외 발생, 비어 있을 경우 기본값 처리
    
    list.add(1);
    list.add(10);
    System.out.println(Collections.min(list));    //1
    System.out.println(Collections.max(list));    //10
    ```
    
- #### String 클래스
    - **substring(int beginindex, (int endindex)) :**
    문자열에 지정한 범위에 속하는 문자열을 반환한다.  
    (시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
    ``` java
    String str = "ABCDEF";
    String test = str.substring(0, 2); //출력결과  AB
    String test = str.substring(2); //출력결과 CDEF
    ```
    
    - **toUpperCase() : 문자열을 모두 대문자로 변환**
    - **toLowerCase() : 문자열을 모두 소문자로 변환**
    ``` java
    String str = "abCD";
    str.toUpperCase();  // ABCD
    str.toLowerCase();  // abcd
    ```
    - **split(String regex) : 특정 문자를 기준으로 잘라서 배열에 저장** 
    - **split(String regex, int limit) : limit는 배열의 크기 결정**  
        - limit가 음수인 경우 : 찾는 패턴이 가능한한 최대로 적용되고 마지막 요소가 빈문자열일 경우 포함됩니다.  
        - limit가 0인 경우 : 찾는패턴이 가능한한 최대로 적용되고 마지막 요소가 빈문자열일 경우 버려집니다(이것이 두 번째 인자가 없을때 동작입니다).  
        - limit가 양수인 경우 : 찾는 패턴이 limit - 1회 적용됩니다. 배열의 길이는 limit보다 크지 않으며, 적용하고 남은 나머지 문자열 전체가 마지막 요소가 됩니다.

    ``` java
    String str = "A, B, C, D";
    String[] array = str.split(",");
    
    //array[0] = A array[1] = B 
    //array[2] = C array[3] = D 
    
    String str2 ="123 456 789 ";
      String[] a = str2.split(" ");
      String[] b = str2.split(" ", 2);
      String[] c = str2.split(" ", 4);
      String[] d = str2.split(" ", -1); //마지막요소가 빈문자열일 경우 포함
      
      for(int i=0; i<a.length;i++){
          System.out.println("a"+i+" ="+a[i]);  //	a0 =123 a1 =456 a2 =789
      }
      for(int i=0; i<b.length;i++){
          System.out.println("b"+i+" ="+b[i]);  //  b0 =123 b1 =456 789 
      }
      for(int i=0; i<c.length;i++){
          System.out.println("c"+i+" ="+c[i]);  // c0 =123 c1 =456 c2 =789 c3 =
      }
      for(int i=0; i<d.length;i++){
          System.out.println("d"+i+" ="+d[i]);  // d0 =123 d1 =456 d2 =789 d3 =
      }
    ```
    
    - **toCharArray() : 문자열을 문자 배열로 변환**
    ``` java
    String str ="ABCD"
    char[] arr = str.toCharArray();
    //출력결과 A B C D
    ```
    
    - **equals(Object obj) : Object 클래스에 정의 되어 있고 다른 클래스에서 상속받아 오버라이딩 되어 있다.  
    일반적으로 주소값을 비교, String 클래스에서는 실제 값 비교**
    ``` java
    String a = "KIM";
    String b = "KIM";
    String c = new String("KIM");
    
    System.out.println(a==b); //true;
    System.out.println(a.equals(b)); //true;
    System.out.println(a==c); //false;
    System.out.println(a.equals(c)); //true;
    ```
    - ** 두 함수 모두 Object의 값을 String으로 변환**  
    - **String.valueOf() : 파라미터가 null이면 문자열 "null"을 만들어서 반환**  
    - **toString() :  대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력**  
    ``` java
    String str = String.valueOf(123);
    System.out.println(str);  //123
    ```
    
- #### for each 문
    - **사용법**   
    for(변수타입 변수이름 : 배열이름)  
      실행부분;  
    단 배열과 컬렉션 사용가능,값을 읽을수만 있고 수정할순없다
    ``` java
    int[] numbers = {1,2,3};
    for(int num : arr) {
      System.out.println(num); // 출력결과 1 2 3
    }
    ```
    
- #### Math 클래스
    - **min(double a, double b) : 작은 값 반환**
    - **max(double a, double b) : 큰 값 반환**
    ``` java
    int a = 10;
    int b = 5;
    min(a,b); //출력결과 5
    max(a,b); //출력결과 10
    ```
    - **pow(double a, double b) : a의 b제곱을 구함**
    - **sqrt(double a): a의 제곱근을 구함**
    ``` java
    System.out.println(Math.pow(2,3));  //8
    System.out.println(Math.sqrt(9)); //3
    ```
    
- #### Character 클래스
    - **isDigit() : char 값이 숫자인지 여부를 판단하여 true/false 리턴**
    ``` java
    System.out.println(Character.isDigit('a')); //false
    System.out.println(Character.isDigit('97')); //true
    System.out.println(Character.isDigit(97)); //false
    //Unicode 값으로 소문자 a로 인식
    ```
    
    - **toUpperCase(char ch) : 입력받은 인자 값을 영문 대문자로 변환하여 리턴**  
    - **toLowerCase(char ch) : 입력받은 인자 값을 영문 소문자로 변환하여 리턴**  
    ``` java
    System.out.println(Character.toUpperCase('a'));   // A
    System.out.println(Character.toLowerCase('A'));   // a
    ```
    
    - **char - '0' : char -> int 형변환**  
    ``` java
    char c = '2';
    System.out.println(c);  // 2 char
    System.out.println((int)c); //50 아스키값
    System.out.println(c-'0');  //2 int
    ```
