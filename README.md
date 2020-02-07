# 프로그래머스 알고리즘 풀이

* 해결한 문제 수 12

## 함수 정리
- #### Arrays 클래스
    - **sort(array) :**  
    배열 정렬(오름차순)
    ``` java
    int [] arr = {2, 4, 9, 7, 5, 2};
    Arrays.sort(arr);   //출력결과  2 2 4 5 7 9
    ```
    - **sort(array, Comparator) :**  
    내림차순 정렬(한글, 영문)
    ``` java
    String[] arr = {"a", "b", "c", "d"};
    Arrays.sort(arr,Collections.reverseOrder());  //출력결과 d c b a 
    
    String[] str = {"11", "13", "23", "53", "223", "145", "53"};
    Arrays.sort(str,Collections.reverseOrder());  //출력결과 53 53 23 223 145 13 11
    // 다만 String타입일 경우, 숫자 자체를 인식하는 것이 아니다보니 무조건 첫번째 자리를 기준으로 내림차순 정렬
    ```
    
    - **copyOf(원본 배열, 복사할 길이) :**  
    배열 복사
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
    
    //가져오기
    numbers.get(1); //출력결과 20
    ```
    
    - **contains(Object o) :**
    리스트에 객체가 존재하면 true 리턴
    ``` java
    String[] fruitsArray = {"apple", "banana", "mango"};
    ArrayList<String> fruits = new ArrayList<>(Arrys.asList(fruitsArray));
    
    System.out.println(fruits.contains("apple")); // 출력결과 true
    System.out.println(fruits.contains("orange")); // 출력결과 false
    ```
    
    - **isEmpty() :**
    ArrayList에 할당되어 있는 값 존재 여부
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
    - **split("기준문자") :**  
    특정 문자를 기준으로 잘라서 배열에 저장
    ``` java
    String str = "A, B, C, D";
    String[] array = str.split(",");
    
    //array[0] = A array[1] = B 
    //array[2] = C array[3] = D 
    ```
    
    - **toCharArray() :**  
    문자열을 문자 배열로 변환
    ``` java
    String str ="ABCD"
    char[] arr = str.toCharArray();
    //출력결과 A B C D
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
    
- #### Character 
    - **isDigit() : char 값이 숫자인지 여부를 판단하여 true/false 리턴**
    ``` java
    System.out.println(Character.isDigit('a')); //false
    System.out.println(Character.isDigit('97')); //true
    System.out.println(Character.isDigit(97)); //false
    //Unicode 값으로 소문자 a로 인식
    ```
    
