package com.Class;

class Assignment {
    private String className;
    private String assignmentDetails;

    public Assignment(String className, String assignmentDetails) {
        this.className = className;
        this.assignmentDetails = assignmentDetails;
    }

    public String getClassName() {
        return className;
    }
    
    public String getAssignmentDetails() {
        return assignmentDetails;
    }
}

