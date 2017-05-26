import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class PatientController {

  private final AtomicLong counter = new AtomicLong();
  private static Map<String, Patient> patientsMap = new HashMap<String, Patient>();

  @RequestMapping(value="/", method= RequestMethod.POST)
  public addPatients(@RequestBody RequestWrapper req) {
    if(req.patients != null) {
      int newID;
      for( int i = 0; i < req.patients.length(); i++){
        newID = counter.incrementAndGet();
        req.patients.get(i).setID(Long.toString(newID));
        patientsMap.put(newId, req.patients.get(i));
      }
    }

    if(req.updater != null){
      //do updater
    }
  }

}
