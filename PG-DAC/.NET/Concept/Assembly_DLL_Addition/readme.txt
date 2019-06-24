#FIRST:
1) Create New Project (Class Library Type) with just a method of addition & no main method - Calculator.cs
      Will generate .dll file under 'Project_Folder/bin/debug'

#SECOND:
2) Create New Project (Console Application Type) To Use Method from Another Project (i.e DLL) file  - Program.cs    
3) From Solution Explore Add Reference into this Project of Calculator Project
      Right Click Over Reference
      Add Reference
      Project -> Solution (OR) Browse and select .dll file from ['Project_Folder/bin/debug']
      Tick on Project Name
      
      
-----------------

To Make it more secure for e.g your .dll file can be used only by those Project who has the access key for this you need to Sign the #FIRST Project

In #FIRST Project [ Solution Explore ]
      Click on Properties
      Select Signing Option
      [Tick] Sign the Assembly
      [Select from DropDOwn]  <New-->   OR If you earlier application signing file use that
      Create New Key and Password
      And Done
      
      
 ------------------
 
 Keep .exe file of #SECOND Project along with .dll of #FIRST project means in same folder so function can be found, called and executed

-------------------

Changing Version:

In Project [Solution Explorer]
      Expand Properties Section
      Open AssemblyInfo.cs
      [Here you can change various information of project] Scroll Down and Change version 
      e.g 
            1.0.0.0 -> 1.0.0.1 (Bug Fix)
            1.0.0.0 -> 1.0.1.0 (New Function Added)
            1.0.0.0 -> 1.1.0.0 (New Module Added)
            1.0.0.0 -> 2.0.0.0 (Stable New Release)
