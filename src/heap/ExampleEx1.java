package heap;
/*https://hmkim829.tistory.com/9
* 최대 힙 트리나 최소 힙 트리를 구성해 정렬하는 방법
*
* .힙(heap) : 최대값 최소값을 찾아내는 연산을 빠르게 하기위해 고안된
* 완전이전트리를 기본으로 한 자료구조
*
* 최대힘
* - 부모노드의 값이 자식노드의 값보다 항상 큰힙
*
* 최소힙
* - 부모 노드의 값이 자식노드의 값보다 항상 작은 힙
*
* */
public class ExampleEx1 {
    public static void main(String[] args){
        // 1. 최대힙을 만드는 과정
        // 만들어진 최대힙을 정렬하는 과정

        // 정렬되지 않은 배열
        //int[] arr = {5, 8, 4, 7 ,10, 9, 2, 1, 6, 3};
        int[] arr = {5, 8, 4, 7 ,10, 9, 2};
        /*
        * 최대힙 만들기
        * 1. 부모노드의 값이 자식노드의 값들보다 큰 형태
        * 2. i의 초기값은 배열의 제일 끝 자식노드의 부모노드부터 시작
        *
        * */
        // 7 / 2 -1 => 2 => 2, 1, 0
        for(int i = arr.length/2 -1 ;i>= 0;i--){
            heapify(arr, arr.length, i);
        }











    }

    private static void heapify(int[] arr, int size, int pNode) {
        int parent = pNode; // 부모노드  // 2
        int lNode = pNode * 2 + 1; // 왼쪽 자식노드
        int rNode = pNode * 2 + 2; // 오른쪽 자식 노드
        int childNode = 0;

        // 자식 노드 중 가장 큰 노드 찾기
        if(size > lNode && size > rNode){
            childNode = arr[lNode] > arr[rNode] ? lNode : rNode;
        }else if(size > lNode && size <= rNode){
            childNode = lNode;
        }else if(size <= lNode && size > rNode){
            childNode = rNode;
        }else{
            return; // 자식노드가 없으면 교환 할 필요가 없다.
        }

        // 자식 노드 중 큰 값과 비교
        if(arr[parent] < arr[childNode]){
            parent = childNode;
        }

        // parent 에 저장한 값은 자식 노드 중 큰 값이 있다면 큰 값의
        // 인덱스 값이 남아있을 것이다.
        // 초기에 설정한 부모노드의 인덱스와 다르다면 교환을 해준다.
        if(parent != pNode){
            swap(arr, pNode, parent);
            /* 노드와 자리를 바꾸면 최대 힙 기준에 맞지 않을 수 있기
            * 바뀐 자식 노드 아래 최대 힙으로 맞춰주기 위함.
            * */
            heapify(arr, size, parent);
        }





    }

    private static void swap(int[] arr, int i, int j) {
        int tmp =arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
