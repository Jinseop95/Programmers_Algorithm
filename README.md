# 프로그래머스 알고리즘 풀이

* 해결한 문제 수 3

## 함수 정리
- Arrays 클래스
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
    // 다만 숫자 자체를 인식하는 것이 아니다보니 무조건 첫번째 자리를 기준으로 내림차순 정렬
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
