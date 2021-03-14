## MERGE 2 FILES
### Using Java

There are two text files, whose names are given by two String variables, 
file1 and file2. These text files have the same number of lines.

Write a sequence of statements that creates a new file whose name consists 
concatenating the names of the two text files (with a "-" in the middle) and 
whose contents of merging the lines of the two files.

Thus, in the new file, the first line is the first line from the first file, 
the second line is the first line from the second file. The third line in the 
new file is the second line in the first file and the fourth line is the second 
line from the second file, and so on.

When finished, make sure that the data written to the new file has been 
flushed from its buffer and that any system resources used during the course 
of running your code have been released.

(Do not concern yourself with any possible exceptions here—assume they are 
handled elsewhere.)

## Explanation:

First we import Scanner from java.util.
We then import everything from java.io.

We then create a Java class called "Two Files", create the Main method and attach an exception common with IO processes.

We create 2 new File objects called file1 and file2 passing in the local filename.
(if the file isnt local to your folder, use the file path)

Create a PrintWriter to create a new file that we will write the merged files to.

Use a while loop to traverse through the contents of the two files until we reach the end 
assigning lines as we go.

Write to the newly created file the lines of the 2 pre-existing files we are reading from.

Close each of the files.
