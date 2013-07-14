
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.Part;

/**
 *
 * @author hiro
 */
@ManagedBean
@SessionScoped
public class  FileuploadBean{
    private Part file1;
    private Part file2;    
    public Part getFile1() {       
        return file1;
    }    
    public void setFile1(Part file1) {       
        this.file1 = file1;
    }    
    public Part getFile2() {        
        return file2;
    }    
    public void setFile2(Part file2) {       
        this.file2 = file2;
    }    
    public String doUpload() {                     
        return "success.xhtml";
    }   
} 
