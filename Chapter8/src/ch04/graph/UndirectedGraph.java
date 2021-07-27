package ch04.graph;

public class UndirectedGraph {

    private int count;//node가 몇 개 인지 count
    private int[][] vertexMatrix;//이차원 배열 사용

    public UndirectedGraph(int count) {// 몇 개 짜리 그래프인지 모르기 때문에 생성자로 받음
        this.count = count;
        vertexMatrix = new int[count][count]; // vertexMatrix를 initialize 해줌.(count 만큼 이차원 배열의 matrix를 만들면 됨. )
    }

    public void addEdges(int from, int to, int weight) { //간선의 유무(여기선 undirectedGraph이기 때문에 weight를 똑같은 값으로 주고, 보통 1을 준다.)
        vertexMatrix[from][to] = weight;//UndirectedGraph는 from,to이 같기 때문에 to,from만 바꿔주면 된다.
        vertexMatrix[to][from] = weight; //만약 directedgraph라면 똑같이 사용하면 안되고 넘어온 인자를 넣어주어야 한다.
    }

    public int[][] getMatrix() { //밖에서 사용할 수 있도록 해줌
        return vertexMatrix;
    }
}
