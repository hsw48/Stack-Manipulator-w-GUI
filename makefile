STACKDIR = uga/cs1302/myStack
TESTDIR = uga/cs1302/test

JFLAGS = -g

JC = javac
.SUFFIXES: .java .class

.java.class: 
	$(JC) $(JFLAGS) -cp .:junit-4.12.jar $*.java
	
CLASSES = \
	$(STACKDIR)/EmptyStackException.java \
	$(STACKDIR)/FullStackException.java \
	$(STACKDIR)/StackADT.java \
	$(STACKDIR)/Stack.java \
	$(STACKDIR)/IntegerStackEmulator.java \
	$(STACKDIR)/MyStackTester.java \
	$(TESTDIR)/MyclassTest.java
	
default: classes

classes: $(CLASSES)

clean: $(RM) $(CLASSES)

