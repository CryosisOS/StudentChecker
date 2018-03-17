JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	run.java \
	Sort.java \ 
	CSVReader.java \
	Display.java \
	UserInput.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
