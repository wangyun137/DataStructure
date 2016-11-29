package stack;

/**
 * Created by wangyun on 16-11-29.
 */
public class MazeByStack {
    //mark the path has been tried
    private static final int TRIED = 3;

    private static final int[][] GRID = {
            {1,1,1,0,1,1,0,0,0,1,1,1,1},
            {1,0,0,1,1,0,1,1,1,1,0,0,1},
            {1,1,1,1,1,0,1,0,1,0,1,0,0},
            {0,0,0,0,1,1,1,0,1,0,1,1,1},
            {1,1,1,0,1,1,1,0,1,0,1,1,1},
            {1,0,1,0,0,0,0,1,1,1,0,0,1},
            {1,0,1,1,1,1,1,1,0,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

    private ArrayStack<Position> pushNewPos(int row, int column, ArrayStack<Position> stack) {
        Position position = new Position();
        position.setRow(row);
        position.setColumn(column);
        if (isValidPos(row, column)) {
            stack.push(position);
        }
        return stack;
    }

    private boolean isValidPos(int row, int column) {
        boolean result = false;
        if (row >=0 && row < GRID.length && column >= 0 && column < GRID[row].length) {
            if (GRID[row][column] == 1) {
                result = true;
            }
        }
        return result;
    }

    public boolean traverse() {
        boolean done = false;
        Position position = new Position();
        ArrayStack<Position> stack = new ArrayStack<>(Position.class);
        stack.push(position);

        while (!done) {
            position = stack.pop();
            GRID[position.getRow()][position.getColumn()] = TRIED;
            if (position.getRow() == GRID.length - 1 &&
                    position.getColumn() == GRID[position.getRow()].length - 1) {
                done = true;
            } else {
                stack = pushNewPos(position.getRow(), position.getColumn() - 1, stack);
                stack = pushNewPos(position.getRow(), position.getColumn() + 1, stack);
                stack = pushNewPos(position.getRow() - 1, position.getColumn(), stack);
                stack = pushNewPos(position.getRow() + 1, position.getColumn(), stack);
            }
        }
        return done;
    }

    @Override
    public String toString() {
        String result = "\n";
        for (int row = 0; row < GRID.length; row++) {
            for (int column = 0; column < GRID[row].length; column++) {
                result += GRID[row][column] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        MazeByStack maze = new MazeByStack();
        if (maze.traverse()) {
            System.out.println("We have successfully traversed the maze");
        } else {
            System.out.println("There is no possible path");
        }
        System.out.println(maze);
    }
}

class Position {
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
