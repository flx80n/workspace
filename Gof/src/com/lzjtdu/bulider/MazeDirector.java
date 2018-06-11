package com.lzjtdu.bulider;

public class MazeDirector {

	private int[][] maze;
    private IMazeBuilder mazeBuilder;

    public void setMaze(int[][] maze) {
        this.maze = maze;
    }
    
    public void setMazeBuilder(IMazeBuilder mazeBuilder) {
        this.mazeBuilder = mazeBuilder;
    }
    
    public void buildMaze() {
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[i].length; j++) {
                // 由於mazeBuilder是IMazeBuilder型態
                // 所以無論Builder實例為何，這邊的程式都無需變動
                switch (maze[i][j]) {
                    case 0:
                        mazeBuilder.createRoadBlock();
                        break;
                    case 1:
                        mazeBuilder.createWallBlock();
                        break;
                    case 2:
                        mazeBuilder.createTreasureBlock();
                        break;
                    default:
                        System.out.println("undefined");
                }
            }
            mazeBuilder.nextRow();    
        }
    }
}
