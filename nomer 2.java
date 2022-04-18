public class data matrix{

    static class graph{
        int vertices;
        int matrix[][];
    }

public graph(int data matrix) {
    this.vertices = data matrix;

    matrix = new int[data matrix] [data matrix];
    
    }

    public void addedge(int Likes , int comment , int share) {
        //addegde
        matrix [source][destination]=share;

        //add back edge for undirected graph
        matrix [destination][source]=share;
        
    }

    

}