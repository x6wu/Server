import java.util.*;

public class RequestWrapper{

  List<Patient> patients;
  UpdaterWrapper updaterWrapper;

  RequestWrapper( List<Patient> patients, UpdaterWrapper updaterWrapper ) {
    this.patients = patients;
    this.updaterWrapper = updaterWrapper;
  }

  public List<Patient> getPatients( ) {
    return patients;
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
}
