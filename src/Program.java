public class Program {
    private String progCode;
    private String progDesc;
    private String duration;
    private String faculty;
    private String progHead;

    //default constructor
    public Program()
    {
        progCode = "";
        progDesc = "";
        duration = "";
        faculty = "";
        progHead = "";
    }
    
    //normal constructor
    public Program(String pc, String pd, String dr, String fc, String ph)
    {
        progCode = pc;
        progDesc = pd;
        duration = dr;
        faculty = fc;
        progHead = ph;
    }

    //copy constructor
    public Program(Program copyProgram)
    {
        this.progCode = copyProgram.progCode;
        this.progDesc = copyProgram.progDesc;
        this.duration = copyProgram.duration;
        this.faculty = copyProgram.faculty;
        this.progHead = copyProgram.progHead;
    }

    //setter
    public void setProgCode(String pc)
    {
        progCode = pc;
    }

    public void setProgDesc(String pd)
    {
        progDesc = pd;
    }

    public void setDuration(String dr)
    {
        duration = dr;
    }

    public void setFaculty(String fc)
    {
        faculty = fc;
    }

    public void setProgHead(String ph)
    {
        progHead = ph;
    }

    //getter
    public String getProgCode()
    {
        return progCode;
    }

    public String getProgDesc()
    {
        return progDesc;
    }

    public String getDuration()
    {
        return duration;
    }

    public String getFaculty()
    {
        return faculty;
    }

    public String getProgHead()
    {
        return progHead;
    }
    

    //processor
    public String programLevel()
    {
        char progCode = getProgCode().charAt(2);
        if(progCode=='0')
            return "Certificate";
        else if(progCode=='1')
            return "Diploma";
        else if(progCode=='2')
            return "Degree";
        else if(progCode=='7')
            return "Master";
        else if(progCode=='9')
            return "PhD";
        else
            return "Invalid Program Code.";
    }

    //printer
    public String toString()
    {
        return String.format("%nProgram Code: %s%nProgram Description: %s%nProgram Level: %s%nDuration: %s%nFaculty: %s%nProgram Head: %s%n", progCode, progDesc, programLevel(), duration, faculty, progHead);
    }
}
