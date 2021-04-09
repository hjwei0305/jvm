package loadClass;


import java.util.HashMap;
import java.util.Map;

public class ReplicaManager extends AbstractDataManager{

    public static int fluishInterval = Configuration.getInt("replica.flush.interval");

    public static Map<String,Replica> replicaMap;

    {
        loadReplicaFromDish();
    }

    private void loadReplicaFromDish() {
        this.replicaMap = new HashMap<>();
    }
}
