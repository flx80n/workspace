package com.lzjtdu.bulider;
/**
 * 建造者模式测试
 * @author soft01
 * 定义：先定义一个接口（为实现建造提供的抽象方法）
 * 		用类实现此接口(展现不同的建造风格)
 * 		定义一个类实现，用于设计建造的细节
 * 		在Test类中完成测试
 * 		
 * 		
 *
 *	Maze：迷宫  
 */

public class Test {
	public static void main(String[] args) {
        int[][] maze = {{1, 1, 1, 1, 1, 1, 1}, 
                        {1, 0, 0, 0, 0, 2, 1}, 
                        {1, 0, 1, 0, 1, 0, 1}, 
                        {1, 0, 2, 1, 0, 1, 1}, 
                        {1, 1, 0, 1, 0, 1, 1}, 
                        {1, 0, 0, 2, 0, 0, 1}, 
                        {1, 1, 1, 1, 1, 1, 1}};
        MazeDirector mazeDirector = new MazeDirector();
        mazeDirector.setMaze(maze);
        
        System.out.println("Build SolidMaze....");
        mazeDirector.setMazeBuilder(new SolidMazeBuilder());
        mazeDirector.buildMaze();
        
        System.out.println("Build DiamondMaze....");
        
        mazeDirector.setMazeBuilder(
                       new DiamondMazeBuilder());
        mazeDirector.buildMaze();
    }
}
