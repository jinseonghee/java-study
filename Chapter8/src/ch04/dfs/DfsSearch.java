package ch04.dfs;

import ch04.graph.UndirectedGraph;

import java.util.Stack;

public class DfsSearch {

    int count;
    boolean[] visited; //방문했는지 안했는지를 정보를 가지고 있어야 하기 때문에 node 수만큼 배열로 만듬
    Stack<Integer> stack; //node가 들어갔다 나갔다 하기 때문에 stack<Integer>필요
    int[][] matrix; //matrix에 대한 정보를 알기 위해 변수 설정

    public DfsSearch(int count) { //UndirectedGraph의 count와 같아서 import 해서 직접 가져와서 사용해도 된다.
        this.count = count;
        visited = new boolean[count]; //count만큼 배열 생성
        stack = new Stack<Integer>();
    }

    public void dfsTraversal() {//어느 node부터 돌 건지 traverse

        stack.push(0); //0부터 돌거기 때문에 stack에 0부터 넣어줌.
        visited[0] = true; //visit 한 걸 다시 들어가지 않기 위해 check

        while (stack.isEmpty() == false) { //stack에 뭐가 있을 경우
            int node = stack.pop(); //node를 하나 꺼냄

            System.out.print(node + " "); //하나 꺼냈으면 방문했다는 뜻이니 node를 찍어줌

            for(int j = 0; j < count; j++) {

                if(matrix[node][j] != 0 && visited[j] == false) { // 가져온 node와 j가 연결이 되어있다면 0값이 아닐것이고, visited가 false 이면(방문 X)

                    stack.push(j); // 위의 조건에 만족하면 j를 stack에 넣는다.
                    visited[j] = true; // j가 stack에 들어갔다는걸 알림(check 역할)
                }
            }
        }
    }

    public static void main(String[] args) {

        int count = 8; //그래프 그리기
        UndirectedGraph graph = new UndirectedGraph(count); //count만큼 UndirectedGraph를 만듬
        graph.addEdges(0,1,1); //UndirectedGraph이기 때문에 from,to와 to,from에 대해 UndirectedGraph 클래스의 addEdges 메서드에 다 주게 설정.
        graph.addEdges(0,2,1); //0,1 이렇게만 줘도 0하고 1이 연결된거 1하고 0이 연결된걸 나타냄
        graph.addEdges(1,3,1);
        graph.addEdges(1,4,1);
        graph.addEdges(2,5,1);
        graph.addEdges(2,6,1);
        graph.addEdges(4,5,1);
        graph.addEdges(3,7,1);

        DfsSearch dfs = new DfsSearch(count); //위에 그래프를 기준으로 traverse
        dfs.matrix = graph.getMatrix(); //dfs의 matrix에 대한 정보를 가져옴

        dfs.dfsTraversal();
    }
}
