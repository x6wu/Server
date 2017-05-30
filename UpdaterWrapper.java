import java.util.*;

public class pair<L, R> { //is this useful To be discussed
    L left;
    R right;

    pair(L left, R right) {
      this.left = left;
      this.right = right;
    }

    public L getLeft( ) {
      return left;
    }

    public R getRight( ) {
      return right;
    }

    public void setLeft( L left ) {
      this.left = left;
    }

    public void setRight( R right ) {
      this.right = right;
    }
}

public class UpdaterWrapper{
  List<pair<String, Patient>> patients;

  UpdaterWrapper( List<pair<String, Patient>> patients ) {
    this.patients = patients;
  }

  public List<pair<String, Patient>> getPatients( ) {
    return patients;
  }

  public void setPatients( List<pair<String, Patient>>  patients ) {
    this.patients = patients;
  }
}
