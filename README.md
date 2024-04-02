# Maze-Solver
Maze solver project that gets you from a start point to end point in a maze using queues and stacks 

This project involves the development of data structures and an algorithm to explore mazes. Initially, it requires setting up an IntelliJ project with provided code, ensuring no issues with the supplied code. The first task is to create a generic stack ADT (Abstract Data Type) named `Stack`, capable of holding any type of data. This stack should support basic operations like push, pop, check for emptiness, retrieve the top item, and determine the size. It should use a linked-list structure, exclude external collection frameworks, and handle comparisons with object equality rather than reference equality.

Similarly, a generic queue ADT called `Queue` is to be developed, supporting enqueue, dequeue, front item retrieval, size, and equality checks. This queue also emphasizes a linked-list approach and object equality.

The project also introduces the `Point` and `Maze` classes to represent maze coordinates and the maze itself, respectively, without allowing modifications to these provided classes.

To navigate through mazes, the project requires implementing two classes, `FifoPointAgenda` and `LifoPointAgenda`, based on the `PointAgenda` interface to manage points to be visited in FIFO (First In First Out) and LIFO (Last In First Out) order, respectively.

The core of the project is the `MazeSolver` class, tasked with solving the maze using either of the point agendas. It involves determining whether an end point can be reached from a starting point within a maze without crossing any walls, relying on systematic exploration rather than recursion. The solver should report whether the maze is solvable and the number of locations visited.

Overall, this project combines data structure implementation and algorithm development for maze exploration, emphasizing generic programming, encapsulation, and interface-based design.

# Sample execution: 

MAZE SOLVER!! 
Please enter name of file containing the maze: test1.txt 
Here is the maze to be solved: 
########## 
# #      
# 
# # #### # 
# # #* # # 
# # ## # # 
# #    # # 
# # #### # 
# ## o## # 
#        
# 
########## 
Please select the type of agenda you want to use by entering its number: 
1: Stack-based agenda 
2: Queue-based agenda 
Enter choice: 1 
Solving the maze with a stack-based agenda: 
Do you want to trace the execution of the solver? (Y|N) 
n 
(5,2)->(4,2)->(4,1)->(5,1)->(6,1)->(7,1)->(8,1)->(8,2)->(8,3)->(8,4)->(8,5)->(8, 
6)->(8,7)->(8,8)->(7,8)->(6,8)->(5,8)->(4,8)->(3,8)->(3,7)->(3,6)->(3,5)->(3,4)- 
>(4,4)->(5,4)->(6,4)->(6,5)->(6,6)->(5,6)->Solution found! 
Number of nodes visited: 29


