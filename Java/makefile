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
	Student.java \
	Units.java \
	Employer.java \
	Rto.java \
	GUI_run.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class .*
