# 프로그래머스 알고리즘 풀이

* 해결한 문제 수 : 86
> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

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
    - **두 함수 모두 Object의 값을 String으로 변환**  
    - **String.valueOf() : 파라미터가 null이면 문자열 "null"을 만들어서 반환**  
    - **toString() :  대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력**  
    ``` java
    String str = String.valueOf(123);
    System.out.println(str);  //123
    ```
    
    - **String.format(포맷형식, 인수) : 문자열에 특정 포맷 적용**
    ```java
    int a = 10;
    String str = "abc";
    
    System.out.println(String.format("%04d", a));   //0010
    
    //길이만큼 좌측에 공백 채움
    System.out.println(String.format("%6s", str));   //___abc ( _ = 공백)
     //길이만큼 우측에 공백 채움
    System.out.println(String.format("%-6s", str));  //abc___   
    ```
    
    - **String replace(CharSequence target, CharSequence replacement) : 문자열 내에 있는 모든 문자열을 replacement문자열로 바꾼 문자열 반환**
    ```java
    String s = "안녕하세요";
    String s2 = s.replace("안녕","건강");
    
    System.out.println(s);  //안녕하세요
    System.out.println(s2); //건강하세요
    ```
    
    - **startsWith(String prefix) : prefix 값으로 시작되는지 여부를 boolean 값으로 리턴**
    ```java
    String str = "안녕하세요";
    System.out.println(str.startsWith("안녕"));  //true
    ```
    
    - **endsWith(String prefix) : prefix 값으로 끝나는지 여부를 boolean 값으로 리턴**
    ```java
    String str = "안녕하세요";
    System.out.println(str.endsWith("하세요"));  //true
    System.out.println(str.endsWith("하세"));     //false
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
    
    - **char - '0' (빼기) : char -> int 형변환**  
    ``` java
    char c = '2';
    System.out.println(c);  // 2 char
    System.out.println((int)c); //50 아스키값
    System.out.println(c-'0');  //2 int
    ```
    
- #### Integer 클래스
    - **Integer.parseInt(String s) : 문자열을 int 형으로 반환**
    ```java
    String str = "123";
    int a = Integer.parseInt(str);
    ```
    
    - **Integer.toString(Int i) : int를 String으로 변환**
    ```java
    int a = 123;
    String str = Integer.toString(a);
    ```
    
    - **Integer.toBinaryString(Int i) : 10진수를 2진수로 변환해 String으로 반환**
    - **Integer.toOctalString(Int i) : 10진수를 8진수로 변환해 String으로 반환**
    - **Integer.toHexString(Int i) : 10진수를 16진수로 변환해 String으로 반환**
    ```java
    int a = 127;
    String binaryString  = Integer.toBinaryString(a);   //1111111
    String octalString   = Integer.toOctalString(a);   //177
    String hexString   = Integer.toHexString(a);      //7f
    ```
    
    - **Integer.pasrseInt(String s, Int n) : n진수를 10진수로 변환**
    ```java
    String binaryString = "1111111";
    String octalString = "177";
    String hexString = "7f";
    
    int a  = Integer.parseInt(binaryString, 2);   //127
    int b   = Integer.parseInt(octalString, 8);   //127
    int c   = Integer.parseInt(hexString, 16);    //127
    ```    
    
    - **Integer.bitCont(int i) : i를 2진수로 변환 후 1의 개수 반환**  
    ```java
    System.out.println(Integer.bitCount(12)); //2
    ```

- #### Queue 인터페이스
  - #### LinkedList
    - FIFO(First In Fisrt Out)
    - **offer() : 데이터 삽입**
    - **poll() : 큐의 맨 앞에 있는 요소 반환, 해당 요소 큐에서 제거**
    - **peek() : 큐의 맨 앞에 있는 요소 반환**
    - **remove() : 큐의 맨앞에 있는 요소 제거**
    ```java
    Queue<Integer> queue = new LinkedList<>(); 
    queue.offer(1);
    queue.offer(2);
    queue.poll();   //1
    queue.peek();   //2
    ```
  - #### PriorityQueue
    - 우선순위큐 , 가장 낮은 순서로 poll(), Min Heap으로 정렬시킴  
    ```java
    PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder()); //내림차순 정렬
- #### Comparable, Comparator
  - **Comparable** : 객체 간의 일반적인 정렬이 필요할 때, Comparable 인터페이스를 확장해서 정렬의 기준을 정의하는 compareTo() 메서드를 구현.  
  - **Comparator** : 객체 간의 특정한 정렬이 필요할 때, Comparator 인터페이스를 확장해서 특정 기준을 정의하는 compare() 메서드를 구현.  
  ```java
  /*  int compare(int x, int y)
        현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
        현재 객체 == 파라미터로 넘어온 객체: 0 리턴
        현재 객체 > 파라미터로 넘어온 객체: 양수 리턴, 두 객체의 자리가 바뀜
  */
  Arrays.sort(arr, new Comparator<String>() {
    public int compare(String o1, String o2){
      return (o1).compareTo(o2);      
      // (o1).compareTo(o2); 오름차순 
      // (o2).compareTo(o1); 내림차순
      }
  });
  
  ```

- #### Map
  - #### HashMap
  - **데이터 저장은 느리지만 많은 양의 데이터를 검색하는데 뛰어남  (key, value), key 중복X, value 중복O , 키값의 오름차순으로저장**
    - **put(Object key, Object value) : Map에 key, value 저장**
    - **bollean containsKey(Object key) : Map에 key와 일치하는 key 객체가 있는지 확인**
    - **bollean containsValue(Object value) : Map에 value 일치하는 value 객체가 있는지 확인**
    - **get(Object key) : key에 대응하는 value 값 반환**
    - **Collection values() : Map에 저장된 모든 value 객체 반환**\
    ```java
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("키값", 5);
    hm.containsKey("키값");   //true
    int tmp = hm.get("키값"); //5
    Collection<Integer> values = hm.values();
    ```
    - **clear() : Map의 모든 객체 삭제**
    - **boolean isEmpty() : Map이 비어있는지 확인**
    - **Set entrySet() : Map에 저장되어 있는 key-value쌍을 Map.Entry 타입의 객체로 저장한 Set 으로 반환**
    - **Set keySet() : Map에 저장된 모든 key객체를 반환**
    - **int size() : Map에 저장된 개수 반환**

- #### Iterator<E> 인터페이스
  - **자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법을 Iterator 인터페이스로 표준화하고 있다.**
  - **boolean hasNext() : 해당 이터레이션(iteration)이 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환**
  - **E next() : 이터레이션(iteration)의 다음 요소를 반환**
  - **void remove() : 해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거함. (선택적 기능)**
  ```java
  HashMap<String, Integer> hm = new HashMap<>();
  hm.put("3", 2);
  hm.put("1", 5);
  hm.put("2", 6);
  Collection<Integer> values = hm.values();
  Iterator it = values.iterator();
  while(it.hasNext()){
    int num = (int)it.next(); 
    System.out.println(num);    
  }       
  /* 결과
    5
    6
    2 */
  ```
  

- #### 정규표현식
    - **POSIX Character classes(US-ASCII only)** 
    
        | 표현식 | 의미 |
        |:--------|:--------|
        |\p{Lower}|소문자| 
        |\p{Upper}|대문자| 
        |\p{ASCII}|모든 ASCII 문자| 
        |\p{Alpha}|문자| 
        |\p{Digit}|숫자| 
        |\p{Alnum}|문자와숫자| 
        |\p{Punct}|특수 문자| 
        |\p{Graph}|문자와 숫자와 특수 문자| 
        |\p{Space}|모든 공백| 
        |\p{XDigit}|16진수|

## 오라클
  - **IS NULL / IS NOT NULL : null 값을 조회하는 방법**
  ``` sql
  WHERE [대상 컬럼] IS NULL     -- NUll인지 비교
  WHERE [대상 컬럼] IS NOT NULL -- NULL이 아닌지 비교
  ```

  - **rownum : 각 데이터의 rownum을 사용하여 원하는 개수만큼 추출**
  ```sql
  -- 상위 5개 조회
  SELECT * FROM (
      SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME)
  WHERE ROWNUM <=6; 

  -- 5 ~ 10개 사이 조회
  SELECT * FROM (
      SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME)
  WHERE ROWNUM BETWEEN 5 AND 10; 

  /* 주의
  쿼리가 실행되는 순서는 FROM - WHERE - GROUP BY - SELECT - ORDER BY.
  ROWNUM 값이 할당되는 건 GROUP BY - ORDER BY 사이.
  그러므로 ORDER BY 전에 ROWNUM이 할당됨으로 정렬된 서브쿼리 결과(ORDER BY절)에 ROWNUM을 매겨야함.
  */
  ```   
  
  - **NVL(값, 지정값) : 값이 NULL인 경우 지정값 출력**
  ```sql
  SELECT NVL(NAME, '없음') 
    FROM ANIMAL;
  ```
  - **NVL2(값, 지정값1, 지정값2) : NULL이 아닌경우 지정값1 출력 , NULL인경우 지정값 2출력**
  ```SQL
  SELECT NVL2(NAME, '있음', '없음')
    FROM ANIMAL;
  ```
  
  - **BETWEEN A AND B : A와 B 사이의 값**
  ```SQL
  SELECT *
  FROM ANIMAL
  WHERE 칼럼 BETWEEN 1 AND 5
  -- 1~5사이의 값
  ```
  
  - **TO_CHAR(숫자혹은날짜,format) : 숫자나 날짜를 문자로 변환**
  - **TO_NUMBER([컬럼명]) : NUMBER형으로 변환**
  - **TO_DATE([컬럼명],format) : DATE형으로 변환**

  ```SQL
  SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL; --2020-02-28
  /*
  TO_CHAR(123456789, '999,999,999')   --123,456,789
  TO_CHAR(SYSDATE, 'HH24:MI:SS')  --15:14:31
  TO_CHAR(SYSDATE, 'HH:MI:SS')    --3:14:31
  
  YYYY : 년도          /   MONTH : 월         / MM : 01~12 의 월(01)
  D : 주중의 일 1~7   /   DAY : 일(월요일..) / DD : 일을 01~31 
  HH : 시간을 01~12  / HL24 : 시간을 01~23  / MI : 분을 00~59
  SS : 초를 01~59   / AM/PM : 오전,오후
  */
  
  SELECT TO_NUMBER('123') FROM DUAL;  --123
  SELECT TO_DATE('2020-03-05','YYYY-MM-DD') FROM DUAL -- 2020-03-05
  ```
  
  - **UPPER() : 대문자로 변환**
  - **LOWER() : 소문자로 변환**
  ```SQL
  SELECT UPPER(칼럼명), LOWER(칼럼명) FROM 테이블;
  ```
  
  - **CASE 조건문**
  ``` SQL
  CASE 
  WHEN SEX_UPON_INTAKE LIKE 'Neutered%' OR  SEX_UPON_INTAKE LIKE  'Spayed%' THEN 'O'
  ELSE 'X'
  END 
  ```
  
  - **COUNT() : 행의 수를 구함**
  ```SQL
  SELECT COUNT(*) FROM ANIMAL;  - ANIMAL테이블의 행의 개수를 구함
  --NULL값을 포함하는 경우 : COUNT(*)
  --NULL값을 포함하지 않는 경우 : COUNT(컬럼명)
  ```
  
  - **Connect by 계층적쿼리 : 데이터를 선택하여 계층적인 순서 그대로 리턴**
  - **LEVEL : 오라클에서 실행되는 모든 쿼리 내에서 사용 가능한 가상-열로서, 트리 내에서 어떤 단계(level)에 있는지를 나타내는 정수값**  
  **계층적인 쿼리가 아니라면 모든 값이 0**
  ```SQL
  SELECT TO_NUMBER(LEVEL-1) HOUR FROM (
    SELECT TO_DATE('20200305', 'YYYYMMDD') 
    FROM DUAL
  ) CONNECT BY LEVEL <= 24
  ```
  
   