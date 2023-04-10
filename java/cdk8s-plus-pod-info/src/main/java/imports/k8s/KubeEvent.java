package imports.k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 * <p>
 * It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.79.0 (build b22f628)", date = "2023-03-31T12:32:10.882Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEvent")
public class KubeEvent extends org.cdk8s.ApiObject {

    protected KubeEvent(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeEvent(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeEvent.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.events.v1.Event" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeEvent(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeEventProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.events.v1.Event".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeEventProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeEvent.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders the object to Kubernetes JSON.
     */
    @Override
    public @org.jetbrains.annotations.NotNull java.lang.Object toJson() {
        return software.amazon.jsii.Kernel.call(this, "toJson", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.events.v1.Event".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeEvent}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeEvent> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.k8s.KubeEventProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeEventProps.Builder();
        }

        /**
         * eventTime is the time when this Event was first observed.
         * <p>
         * It is required.
         * <p>
         * @return {@code this}
         * @param eventTime eventTime is the time when this Event was first observed. This parameter is required.
         */
        public Builder eventTime(final java.time.Instant eventTime) {
            this.props.eventTime(eventTime);
            return this;
        }

        /**
         * action is what action was taken/failed regarding to the regarding object.
         * <p>
         * It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
         * <p>
         * @return {@code this}
         * @param action action is what action was taken/failed regarding to the regarding object. This parameter is required.
         */
        public Builder action(final java.lang.String action) {
            this.props.action(action);
            return this;
        }

        /**
         * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedCount deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedCount(final java.lang.Number deprecatedCount) {
            this.props.deprecatedCount(deprecatedCount);
            return this;
        }

        /**
         * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedFirstTimestamp deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedFirstTimestamp(final java.time.Instant deprecatedFirstTimestamp) {
            this.props.deprecatedFirstTimestamp(deprecatedFirstTimestamp);
            return this;
        }

        /**
         * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedLastTimestamp deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedLastTimestamp(final java.time.Instant deprecatedLastTimestamp) {
            this.props.deprecatedLastTimestamp(deprecatedLastTimestamp);
            return this;
        }

        /**
         * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedSource deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedSource(final imports.k8s.EventSource deprecatedSource) {
            this.props.deprecatedSource(deprecatedSource);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * note is a human-readable description of the status of this operation.
         * <p>
         * Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
         * <p>
         * @return {@code this}
         * @param note note is a human-readable description of the status of this operation. This parameter is required.
         */
        public Builder note(final java.lang.String note) {
            this.props.note(note);
            return this;
        }

        /**
         * reason is why the action was taken.
         * <p>
         * It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
         * <p>
         * @return {@code this}
         * @param reason reason is why the action was taken. This parameter is required.
         */
        public Builder reason(final java.lang.String reason) {
            this.props.reason(reason);
            return this;
        }

        /**
         * regarding contains the object this Event is about.
         * <p>
         * In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
         * <p>
         * @return {@code this}
         * @param regarding regarding contains the object this Event is about. This parameter is required.
         */
        public Builder regarding(final imports.k8s.ObjectReference regarding) {
            this.props.regarding(regarding);
            return this;
        }

        /**
         * related is the optional secondary object for more complex actions.
         * <p>
         * E.g. when regarding object triggers a creation or deletion of related object.
         * <p>
         * @return {@code this}
         * @param related related is the optional secondary object for more complex actions. This parameter is required.
         */
        public Builder related(final imports.k8s.ObjectReference related) {
            this.props.related(related);
            return this;
        }

        /**
         * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
         * <p>
         * @return {@code this}
         * @param reportingController reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events. This parameter is required.
         */
        public Builder reportingController(final java.lang.String reportingController) {
            this.props.reportingController(reportingController);
            return this;
        }

        /**
         * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
         * <p>
         * @return {@code this}
         * @param reportingInstance reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters. This parameter is required.
         */
        public Builder reportingInstance(final java.lang.String reportingInstance) {
            this.props.reportingInstance(reportingInstance);
            return this;
        }

        /**
         * series is data about the Event series this event represents or nil if it's a singleton Event.
         * <p>
         * @return {@code this}
         * @param series series is data about the Event series this event represents or nil if it's a singleton Event. This parameter is required.
         */
        public Builder series(final imports.k8s.EventSeries series) {
            this.props.series(series);
            return this;
        }

        /**
         * type is the type of this event (Normal, Warning), new types could be added in the future.
         * <p>
         * It is machine-readable. This field cannot be empty for new Events.
         * <p>
         * @return {@code this}
         * @param type type is the type of this event (Normal, Warning), new types could be added in the future. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.props.type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeEvent}.
         */
        @Override
        public imports.k8s.KubeEvent build() {
            return new imports.k8s.KubeEvent(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
