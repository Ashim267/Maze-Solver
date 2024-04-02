// File name: MazeSolver.java
// Author: Ashim Chand
// userid: chanda
// Email: chand.ashim@gmail.com
// Class: CS2201 @ Vanderbilt U.
// Assignment Number: 7
// Description:  Class that solves a maze, given the maze and an agenda.
// Last Changed:  4/1/2024

// TODO 
// Your job to fill in this file!


import java.util.Scanner;
public class MazeSolver{

    private Maze maze;
    private PointAgenda agenda;
    int nodesVisited;

    public MazeSolver(Maze newMaze, PointAgenda newAgenda) {
        this.maze = newMaze;
        this.agenda = newAgenda;
        this.nodesVisited = 0;
    }


    public boolean solve(boolean trace){
        Point start = maze.getStartLocation();
        Point end = maze.getEndLocation();

        maze.markVisited(start.x, start.y);
        agenda.add(start);

        while (!agenda.isEmpty()) {
            Point current = agenda.peek();
            agenda.remove();
            System.out.print(current + "->");

            nodesVisited++;

            if (current.equals(end)) {
                System.out.println("\nSolution found!");
                System.out.println("Number of nodes visited: " + nodesVisited);
                return true;
            }

            addAgenda(current);

        }

        System.out.println("The maze is unsolvable.");
        System.out.println("Number of nodes visited: " + nodesVisited);
        return false;
    }

    private void addAgenda(Point current) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int[] direction : directions) {
            int newX = current.x + direction[0];
            int newY = current.y + direction[1];
            Point aPoint = new Point(newX, newY);

            if (newX >= 0 && newX < maze.getNumCols() && newY >= 0 && newY < maze.getNumRows()
                    && maze.isOpen(newX, newY) && !maze.hasBeenVisited(newX, newY)) {
                agenda.add(aPoint);
                maze.markVisited(newX, newY);
            }
        }
    }
}
