package imports.k8s;

/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.957Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.TopologySpreadConstraint")
@software.amazon.jsii.Jsii.Proxy(TopologySpreadConstraint.Jsii$Proxy.class)
public interface TopologySpreadConstraint extends software.amazon.jsii.JsiiSerializable {

    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed.
     * <p>
     * When <code>whenUnsatisfiable=DoNotSchedule</code>, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. The global minimum is the minimum number of matching pods in an eligible domain or zero if the number of eligible domains is less than MinDomains. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 2/2/1: In this case, the global minimum is 1. | zone1 | zone2 | zone3 | |  P P  |  P P  |   P   | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2; scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When <code>whenUnsatisfiable=ScheduleAnyway</code>, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMaxSkew();

    /**
     * TopologyKey is the key of node labels.
     * <p>
     * Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a "bucket", and try to put balanced number of pods into each bucket. We define a domain as a particular instance of a topology. Also, we define an eligible domain as a domain whose nodes meet the requirements of nodeAffinityPolicy and nodeTaintsPolicy. e.g. If TopologyKey is "kubernetes.io/hostname", each Node is a domain of that topology. And, if TopologyKey is "topology.kubernetes.io/zone", each zone is a domain of that topology. It's a required field.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTopologyKey();

    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint.
     * <p>
     * <ul>
     * <li>DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     * but giving higher precedence to topologies that would help reduce the
     * skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assignment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it <em>more</em> imbalanced. It's a required field.</li>
     * </ul>
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWhenUnsatisfiable();

    /**
     * LabelSelector is used to find matching pods.
     * <p>
     * Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getLabelSelector() {
        return null;
    }

    /**
     * MatchLabelKeys is a set of pod label keys to select the pods over which spreading will be calculated.
     * <p>
     * The keys are used to lookup values from the incoming pod labels, those key-value labels are ANDed with labelSelector to select the group of existing pods over which spreading will be calculated for the incoming pod. Keys that don't exist in the incoming pod labels will be ignored. A null or empty list means only match against labelSelector.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getMatchLabelKeys() {
        return null;
    }

    /**
     * MinDomains indicates a minimum number of eligible domains.
     * <p>
     * When the number of eligible domains with matching topology keys is less than minDomains, Pod Topology Spread treats "global minimum" as 0, and then the calculation of Skew is performed. And when the number of eligible domains with matching topology keys equals or greater than minDomains, this value has no effect on scheduling. As a result, when the number of eligible domains is less than minDomains, scheduler won't schedule more than maxSkew Pods to those domains. If value is nil, the constraint behaves as if MinDomains is equal to 1. Valid values are integers greater than 0. When value is not nil, WhenUnsatisfiable must be DoNotSchedule.
     * <p>
     * For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same labelSelector spread as 2/2/2: | zone1 | zone2 | zone3 | |  P P  |  P P  |  P P  | The number of domains is less than 5(MinDomains), so "global minimum" is treated as 0. In this situation, new pod with the same labelSelector cannot be scheduled, because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones, it will violate MaxSkew.
     * <p>
     * This is a beta field and requires the MinDomainsInPodTopologySpread feature gate to be enabled (enabled by default).
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinDomains() {
        return null;
    }

    /**
     * NodeAffinityPolicy indicates how we will treat Pod's nodeAffinity/nodeSelector when calculating pod topology spread skew.
     * <p>
     * Options are: - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations. - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.
     * <p>
     * If this value is nil, the behavior is equivalent to the Honor policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeAffinityPolicy() {
        return null;
    }

    /**
     * NodeTaintsPolicy indicates how we will treat node taints when calculating pod topology spread skew.
     * <p>
     * Options are: - Honor: nodes without taints, along with tainted nodes for which the incoming pod has a toleration, are included. - Ignore: node taints are ignored. All nodes are included.
     * <p>
     * If this value is nil, the behavior is equivalent to the Ignore policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeTaintsPolicy() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link TopologySpreadConstraint}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link TopologySpreadConstraint}
     */
    public static final class Builder implements software.amazon.jsii.Builder<TopologySpreadConstraint> {
        java.lang.Number maxSkew;
        java.lang.String topologyKey;
        java.lang.String whenUnsatisfiable;
        imports.k8s.LabelSelector labelSelector;
        java.util.List<java.lang.String> matchLabelKeys;
        java.lang.Number minDomains;
        java.lang.String nodeAffinityPolicy;
        java.lang.String nodeTaintsPolicy;

        /**
         * Sets the value of {@link TopologySpreadConstraint#getMaxSkew}
         * @param maxSkew MaxSkew describes the degree to which pods may be unevenly distributed. This parameter is required.
         *                When <code>whenUnsatisfiable=DoNotSchedule</code>, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. The global minimum is the minimum number of matching pods in an eligible domain or zero if the number of eligible domains is less than MinDomains. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 2/2/1: In this case, the global minimum is 1. | zone1 | zone2 | zone3 | |  P P  |  P P  |   P   | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2; scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When <code>whenUnsatisfiable=ScheduleAnyway</code>, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
         * @return {@code this}
         */
        public Builder maxSkew(java.lang.Number maxSkew) {
            this.maxSkew = maxSkew;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getTopologyKey}
         * @param topologyKey TopologyKey is the key of node labels. This parameter is required.
         *                    Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a "bucket", and try to put balanced number of pods into each bucket. We define a domain as a particular instance of a topology. Also, we define an eligible domain as a domain whose nodes meet the requirements of nodeAffinityPolicy and nodeTaintsPolicy. e.g. If TopologyKey is "kubernetes.io/hostname", each Node is a domain of that topology. And, if TopologyKey is "topology.kubernetes.io/zone", each zone is a domain of that topology. It's a required field.
         * @return {@code this}
         */
        public Builder topologyKey(java.lang.String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getWhenUnsatisfiable}
         * @param whenUnsatisfiable WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. This parameter is required.
         *                          <ul>
         *                          <li>DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
         *                          but giving higher precedence to topologies that would help reduce the
         *                          skew.
         *                          A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assignment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it <em>more</em> imbalanced. It's a required field.</li>
         *                          </ul>
         * @return {@code this}
         */
        public Builder whenUnsatisfiable(java.lang.String whenUnsatisfiable) {
            this.whenUnsatisfiable = whenUnsatisfiable;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getLabelSelector}
         * @param labelSelector LabelSelector is used to find matching pods.
         *                      Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
         * @return {@code this}
         */
        public Builder labelSelector(imports.k8s.LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getMatchLabelKeys}
         * @param matchLabelKeys MatchLabelKeys is a set of pod label keys to select the pods over which spreading will be calculated.
         *                       The keys are used to lookup values from the incoming pod labels, those key-value labels are ANDed with labelSelector to select the group of existing pods over which spreading will be calculated for the incoming pod. Keys that don't exist in the incoming pod labels will be ignored. A null or empty list means only match against labelSelector.
         * @return {@code this}
         */
        public Builder matchLabelKeys(java.util.List<java.lang.String> matchLabelKeys) {
            this.matchLabelKeys = matchLabelKeys;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getMinDomains}
         * @param minDomains MinDomains indicates a minimum number of eligible domains.
         *                   When the number of eligible domains with matching topology keys is less than minDomains, Pod Topology Spread treats "global minimum" as 0, and then the calculation of Skew is performed. And when the number of eligible domains with matching topology keys equals or greater than minDomains, this value has no effect on scheduling. As a result, when the number of eligible domains is less than minDomains, scheduler won't schedule more than maxSkew Pods to those domains. If value is nil, the constraint behaves as if MinDomains is equal to 1. Valid values are integers greater than 0. When value is not nil, WhenUnsatisfiable must be DoNotSchedule.
         *                   <p>
         *                   For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same labelSelector spread as 2/2/2: | zone1 | zone2 | zone3 | |  P P  |  P P  |  P P  | The number of domains is less than 5(MinDomains), so "global minimum" is treated as 0. In this situation, new pod with the same labelSelector cannot be scheduled, because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones, it will violate MaxSkew.
         *                   <p>
         *                   This is a beta field and requires the MinDomainsInPodTopologySpread feature gate to be enabled (enabled by default).
         * @return {@code this}
         */
        public Builder minDomains(java.lang.Number minDomains) {
            this.minDomains = minDomains;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getNodeAffinityPolicy}
         * @param nodeAffinityPolicy NodeAffinityPolicy indicates how we will treat Pod's nodeAffinity/nodeSelector when calculating pod topology spread skew.
         *                           Options are: - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations. - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.
         *                           <p>
         *                           If this value is nil, the behavior is equivalent to the Honor policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
         * @return {@code this}
         */
        public Builder nodeAffinityPolicy(java.lang.String nodeAffinityPolicy) {
            this.nodeAffinityPolicy = nodeAffinityPolicy;
            return this;
        }

        /**
         * Sets the value of {@link TopologySpreadConstraint#getNodeTaintsPolicy}
         * @param nodeTaintsPolicy NodeTaintsPolicy indicates how we will treat node taints when calculating pod topology spread skew.
         *                         Options are: - Honor: nodes without taints, along with tainted nodes for which the incoming pod has a toleration, are included. - Ignore: node taints are ignored. All nodes are included.
         *                         <p>
         *                         If this value is nil, the behavior is equivalent to the Ignore policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
         * @return {@code this}
         */
        public Builder nodeTaintsPolicy(java.lang.String nodeTaintsPolicy) {
            this.nodeTaintsPolicy = nodeTaintsPolicy;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link TopologySpreadConstraint}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public TopologySpreadConstraint build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link TopologySpreadConstraint}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements TopologySpreadConstraint {
        private final java.lang.Number maxSkew;
        private final java.lang.String topologyKey;
        private final java.lang.String whenUnsatisfiable;
        private final imports.k8s.LabelSelector labelSelector;
        private final java.util.List<java.lang.String> matchLabelKeys;
        private final java.lang.Number minDomains;
        private final java.lang.String nodeAffinityPolicy;
        private final java.lang.String nodeTaintsPolicy;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.maxSkew = software.amazon.jsii.Kernel.get(this, "maxSkew", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.topologyKey = software.amazon.jsii.Kernel.get(this, "topologyKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.whenUnsatisfiable = software.amazon.jsii.Kernel.get(this, "whenUnsatisfiable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.labelSelector = software.amazon.jsii.Kernel.get(this, "labelSelector", software.amazon.jsii.NativeType.forClass(imports.k8s.LabelSelector.class));
            this.matchLabelKeys = software.amazon.jsii.Kernel.get(this, "matchLabelKeys", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.minDomains = software.amazon.jsii.Kernel.get(this, "minDomains", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.nodeAffinityPolicy = software.amazon.jsii.Kernel.get(this, "nodeAffinityPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeTaintsPolicy = software.amazon.jsii.Kernel.get(this, "nodeTaintsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.maxSkew = java.util.Objects.requireNonNull(builder.maxSkew, "maxSkew is required");
            this.topologyKey = java.util.Objects.requireNonNull(builder.topologyKey, "topologyKey is required");
            this.whenUnsatisfiable = java.util.Objects.requireNonNull(builder.whenUnsatisfiable, "whenUnsatisfiable is required");
            this.labelSelector = builder.labelSelector;
            this.matchLabelKeys = builder.matchLabelKeys;
            this.minDomains = builder.minDomains;
            this.nodeAffinityPolicy = builder.nodeAffinityPolicy;
            this.nodeTaintsPolicy = builder.nodeTaintsPolicy;
        }

        @Override
        public final java.lang.Number getMaxSkew() {
            return this.maxSkew;
        }

        @Override
        public final java.lang.String getTopologyKey() {
            return this.topologyKey;
        }

        @Override
        public final java.lang.String getWhenUnsatisfiable() {
            return this.whenUnsatisfiable;
        }

        @Override
        public final imports.k8s.LabelSelector getLabelSelector() {
            return this.labelSelector;
        }

        @Override
        public final java.util.List<java.lang.String> getMatchLabelKeys() {
            return this.matchLabelKeys;
        }

        @Override
        public final java.lang.Number getMinDomains() {
            return this.minDomains;
        }

        @Override
        public final java.lang.String getNodeAffinityPolicy() {
            return this.nodeAffinityPolicy;
        }

        @Override
        public final java.lang.String getNodeTaintsPolicy() {
            return this.nodeTaintsPolicy;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("maxSkew", om.valueToTree(this.getMaxSkew()));
            data.set("topologyKey", om.valueToTree(this.getTopologyKey()));
            data.set("whenUnsatisfiable", om.valueToTree(this.getWhenUnsatisfiable()));
            if (this.getLabelSelector() != null) {
                data.set("labelSelector", om.valueToTree(this.getLabelSelector()));
            }
            if (this.getMatchLabelKeys() != null) {
                data.set("matchLabelKeys", om.valueToTree(this.getMatchLabelKeys()));
            }
            if (this.getMinDomains() != null) {
                data.set("minDomains", om.valueToTree(this.getMinDomains()));
            }
            if (this.getNodeAffinityPolicy() != null) {
                data.set("nodeAffinityPolicy", om.valueToTree(this.getNodeAffinityPolicy()));
            }
            if (this.getNodeTaintsPolicy() != null) {
                data.set("nodeTaintsPolicy", om.valueToTree(this.getNodeTaintsPolicy()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.TopologySpreadConstraint"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            TopologySpreadConstraint.Jsii$Proxy that = (TopologySpreadConstraint.Jsii$Proxy) o;

            if (!maxSkew.equals(that.maxSkew)) return false;
            if (!topologyKey.equals(that.topologyKey)) return false;
            if (!whenUnsatisfiable.equals(that.whenUnsatisfiable)) return false;
            if (this.labelSelector != null ? !this.labelSelector.equals(that.labelSelector) : that.labelSelector != null) return false;
            if (this.matchLabelKeys != null ? !this.matchLabelKeys.equals(that.matchLabelKeys) : that.matchLabelKeys != null) return false;
            if (this.minDomains != null ? !this.minDomains.equals(that.minDomains) : that.minDomains != null) return false;
            if (this.nodeAffinityPolicy != null ? !this.nodeAffinityPolicy.equals(that.nodeAffinityPolicy) : that.nodeAffinityPolicy != null) return false;
            return this.nodeTaintsPolicy != null ? this.nodeTaintsPolicy.equals(that.nodeTaintsPolicy) : that.nodeTaintsPolicy == null;
        }

        @Override
        public final int hashCode() {
            int result = this.maxSkew.hashCode();
            result = 31 * result + (this.topologyKey.hashCode());
            result = 31 * result + (this.whenUnsatisfiable.hashCode());
            result = 31 * result + (this.labelSelector != null ? this.labelSelector.hashCode() : 0);
            result = 31 * result + (this.matchLabelKeys != null ? this.matchLabelKeys.hashCode() : 0);
            result = 31 * result + (this.minDomains != null ? this.minDomains.hashCode() : 0);
            result = 31 * result + (this.nodeAffinityPolicy != null ? this.nodeAffinityPolicy.hashCode() : 0);
            result = 31 * result + (this.nodeTaintsPolicy != null ? this.nodeTaintsPolicy.hashCode() : 0);
            return result;
        }
    }
}
