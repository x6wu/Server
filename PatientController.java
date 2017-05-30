import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

/**
 * The controller to handle POST and GET requests
 * to add, update or get patients information.
 */
@RestController
public class PatientController {

  //Counter used to handle giving unique IDs to new patients.
  private final AtomicLong counter = new AtomicLong();

  //Map of patients that holds all existing patients.
  private static Map<String, Patient> patientsMap = new HashMap<String, Patient>();

  /**
   * This function takes in a JS object that holds a list
   * of patients to be added to our existing patients
   * and holds an additional JS holding a list of existing
   * patients but with new information that should be updated
   * within our map.
   *
   * @param req JS object representative
   * @return TBA
   */
  @RequestMapping(value="/", method=RequestMethod.POST)
  public ResponseEntity<Map<String, Patient>> postReq(@RequestBody RequestWrapper req) {
    patientsAdder( req.getPatients( ) ); //Add new patients

    if( req.getUpdaterWrapper( ) != null ) //If we have the second JS
      //then update existing patients.
      patientsUpdater( req.getUpdaterWrapper( ).getPatients( ) );

    //From what I understand this will print out the map and an OK status.
    return new ResponseEntity<Map<String, Patient>> (patientsMap, HttpStatus.OK);
  }

  //TBA
  @RequestMapping(value="/", method=RequestMethod.GET)
  public void getReq( ) {
    //TBA
  }

  /**
   * Helper method that adds a list of Patient object to the
   * current map of Patient objects.
   *
   * @param patients The list containing all new patients to be mapped
   */
  private void patientsAdder( List<Patient> patients ) {
    if( patients != null )
      return;

    int newID;
    //foreach patient in patient list
    for( Patient patient : patients ){
      //Get the next unique ID
      newID = counter.incrementAndGet( );

      //Give the patient its new ID
      patient.setID( Long.toString( newID ) );

      //Add the new patient within the patient map
      patientsMap.put( newID, patient ) );
    }
  }

  /**
   * Helper method that updates existing patients within
   * new information, or simply put deletes old patient object
   * and adds the new one.
   *
   * @param patients List of patients with new updated information
   */
  private void patientsUpdater( List<pair<String, Patient>> patientsPair ) {
    if( patientsPair == null )
      return;

    //foreach patient pair in patient pair list
    for( pair<String, Patient> patientPair : patientsPair )
      //Update the map where the patient used to exist.
      patientsMap.put( patientPair.getLeft( ), patientPair.getRight( ) );
  }
}
