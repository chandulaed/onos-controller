package org.onosproject.provider.sdnwise.flow;

import org.onlab.graph.ScalarWeight;
import org.onlab.graph.Weight;
import org.onosproject.net.Link;
import org.onosproject.net.topology.LinkWeigher;
import org.onosproject.net.topology.TopologyEdge;
import static java.lang.Double.parseDouble;

/**
 * Created by aca on 3/6/15.
 */
public class SDNWiseLinkWeight implements LinkWeigher {
    @Override
    public Weight weight(TopologyEdge edge) {
        Link link = edge.link();
        String rssi = link.annotations().value("rssi");
        return ScalarWeight.toWeight(parseDouble(rssi));
    }

    @Override
    public Weight getInitialWeight() {
        return null;
    }

    @Override
    public Weight getNonViableWeight() {
        return null;
    }
}
