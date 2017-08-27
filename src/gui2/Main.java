package gui2;

public class Main {


    public static void main(String[] args) {

        Board b = new Board();
        int map[][] = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 1, 1},
                {1, 6, 2, 1, 3, 1, 1, 2, 2, 1},
                {1, 2, 2, 3, 3, 1, 1, 2, 2, 1},
                {1, 3, 2, 1, 1, 1, 1, 4, 4, 1},
                {1, 8, 2, 1, 1, 1, 1, 7, 7, 1},
                {1, 2, 5, 1, 1, 1, 8, 2, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        b.setUpBoard(map);
        try {
            b.update();
        }catch (InterruptedException e){

        }


    }
}

