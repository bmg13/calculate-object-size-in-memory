# Calculate a size in memory of an object

## Description

The goal of this small app is to know the in memory size of an object. It also considers the use of a HashMap and List, in which it is identified the difference between the size with references and size with complete object.


## Additional notes
To make this project, a tutorial was followed: https://www.baeldung.com/java-size-of-object

As indicated in the tutorial the VM option was added:
-javaagent:"/Users/monteirog/Desktop/work/calculate-object-size-in-memory/src/main/java/com/CalculateObjectSizeInMemory.jar"


## Run in terminal 
> cd src/main/java/com

> javac CalculateObjectSizeInMemoryService.java

> jar cmf MANIFEST.MF CalculateObjectSizeInMemory.jar CalculateObjectSizeInMemoryService.class

## Expected outcome

The following is an example of outcome of this app. Keep in mind that, in this example, the HashMap has 1 000 000 entries.

<pre><code>
Object type: class java.lang.String, single size: 24 bytes
------------------------------------------------------------------------------
Object type: class com.model.RandomPOJO, single size: 24 bytes
------------------------------------------------------------------------------
Object type: class java.util.ArrayList, single size: 24 bytes
Object type: class java.util.ArrayList, size of entire content is 32000 bytes
------------------------------------------------------------------------------
Object type: class java.util.HashMap, single size: 48 bytes
Object type: class java.util.HashMap, size of entire content is 40000000 bytes
------------------------------------------------------------------------------
</code></pre>
