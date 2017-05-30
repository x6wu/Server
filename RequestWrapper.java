import java.util.*;

public class RequestWrapper{

  List<Patient> patients;
  List<String> IDs;
  UpdaterWrapper updaterWrapper;

  RequestWrapper( List<Patient> patients, UpdaterWrapper updaterWrapper, List<String> IDs ) {
    this.patients = patients;
    this.updaterWrapper = updaterWrapper;
    this.IDs = IDs;
  }

  public List<Patient> getPatients( ) {
    return patients;
  }

  public List<String> getIDs(){
    return IDs;
  }

  public UpdaterWrapper getUpdaterWrapper( ) {
    return updaterWrapper;
  }

  public void setPatients( List<Patient> patients ) {
    this.patients = patients;
  }

  public void setUpdaterWrapper( UpdaterWrapper updaterWrapper ) {
    this.updaterWrapper = updaterWrapper;
  }

  public void setIDs(List<String> IDs){
    this.IDs = IDs;
  }
}
