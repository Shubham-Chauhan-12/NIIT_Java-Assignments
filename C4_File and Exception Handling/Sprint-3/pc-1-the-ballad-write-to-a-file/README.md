# Problem Statement - The Night Before Christmas – Write to a File

The Night Before Christmas is a ballad and much-loved Christmas poem by Clement Clarke Moore. 
The poem must be saved to a file so that text analysis can be performed on it.
Write a java program to write the poem saved as a string to a text file. Use the ***OutputStream*** classes.

## Tasks

### Task - 1 
Declare and initialize a String variable ballad with the data below in the main method of the PoemAnalysis class.

'Twas the night before Christmas, when all through the house

Not a creature was stirring, not even a mouse;

The stockings were hung by the chimney with care,

In hopes that St. Nicholas soon would be there;



The children were nestled all snug in their beds,

While visions of sugar-plums danced in their heads;

And mamma in her 'kerchief, and I in my cap,

Had just settled down for a long winter's nap,



When out on the lawn there arose such a clatter,

I sprang from the bed to see what was the matter.

Away to the window I flew like a flash,

Tore open the shutters and threw up the sash.

### Task - 2

- Write a method **writePoemToAFile(String fileName, String ballad)** that will write the data as bytes into the file.
- Use the FileOutputStream class to write to the file specified in the parameter list of the method.
- Make a call to the writePoemToAFile method from the main method and pass the file name and string ballad to it.
- Handle all exceptions.


