package imports.k8s;

/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.80.0 (build bce6a1d)", date = "2023-05-04T19:06:51.890Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Probe")
@software.amazon.jsii.Jsii.Proxy(Probe.Jsii$Proxy.class)
public interface Probe extends software.amazon.jsii.JsiiSerializable {

    /**
     * Exec specifies the action to take.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ExecAction getExec() {
        return null;
    }

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded.
     * <p>
     * Defaults to 3. Minimum value is 1.
     * <p>
     * Default: 3. Minimum value is 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getFailureThreshold() {
        return null;
    }

    /**
     * GRPC specifies an action involving a GRPC port.
     * <p>
     * This is a beta field and requires enabling GRPCContainerProbe feature gate.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.GrpcAction getGrpc() {
        return null;
    }

    /**
     * HTTPGet specifies the http request to perform.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HttpGetAction getHttpGet() {
        return null;
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInitialDelaySeconds() {
        return null;
    }

    /**
     * How often (in seconds) to perform the probe.
     * <p>
     * Default to 10 seconds. Minimum value is 1.
     * <p>
     * Default: 10 seconds. Minimum value is 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPeriodSeconds() {
        return null;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed.
     * <p>
     * Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * <p>
     * Default: 1. Must be 1 for liveness and startup. Minimum value is 1.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSuccessThreshold() {
        return null;
    }

    /**
     * TCPSocket specifies an action involving a TCP port.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.TcpSocketAction getTcpSocket() {
        return null;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure.
     * <p>
     * The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTerminationGracePeriodSeconds() {
        return null;
    }

    /**
     * Number of seconds after which the probe times out.
     * <p>
     * Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * <p>
     * Default: 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Probe}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Probe}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Probe> {
        imports.k8s.ExecAction exec;
        java.lang.Number failureThreshold;
        imports.k8s.GrpcAction grpc;
        imports.k8s.HttpGetAction httpGet;
        java.lang.Number initialDelaySeconds;
        java.lang.Number periodSeconds;
        java.lang.Number successThreshold;
        imports.k8s.TcpSocketAction tcpSocket;
        java.lang.Number terminationGracePeriodSeconds;
        java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link Probe#getExec}
         * @param exec Exec specifies the action to take.
         * @return {@code this}
         */
        public Builder exec(imports.k8s.ExecAction exec) {
            this.exec = exec;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getFailureThreshold}
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded.
         *                         Defaults to 3. Minimum value is 1.
         * @return {@code this}
         */
        public Builder failureThreshold(java.lang.Number failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getGrpc}
         * @param grpc GRPC specifies an action involving a GRPC port.
         *             This is a beta field and requires enabling GRPCContainerProbe feature gate.
         * @return {@code this}
         */
        public Builder grpc(imports.k8s.GrpcAction grpc) {
            this.grpc = grpc;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getHttpGet}
         * @param httpGet HTTPGet specifies the http request to perform.
         * @return {@code this}
         */
        public Builder httpGet(imports.k8s.HttpGetAction httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getInitialDelaySeconds}
         * @param initialDelaySeconds Number of seconds after the container has started before liveness probes are initiated.
         *                            More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * @return {@code this}
         */
        public Builder initialDelaySeconds(java.lang.Number initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getPeriodSeconds}
         * @param periodSeconds How often (in seconds) to perform the probe.
         *                      Default to 10 seconds. Minimum value is 1.
         * @return {@code this}
         */
        public Builder periodSeconds(java.lang.Number periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getSuccessThreshold}
         * @param successThreshold Minimum consecutive successes for the probe to be considered successful after having failed.
         *                         Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
         * @return {@code this}
         */
        public Builder successThreshold(java.lang.Number successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getTcpSocket}
         * @param tcpSocket TCPSocket specifies an action involving a TCP port.
         * @return {@code this}
         */
        public Builder tcpSocket(imports.k8s.TcpSocketAction tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getTerminationGracePeriodSeconds}
         * @param terminationGracePeriodSeconds Optional duration in seconds the pod needs to terminate gracefully upon probe failure.
         *                                      The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
         * @return {@code this}
         */
        public Builder terminationGracePeriodSeconds(java.lang.Number terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link Probe#getTimeoutSeconds}
         * @param timeoutSeconds Number of seconds after which the probe times out.
         *                       Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Probe}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Probe build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Probe}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Probe {
        private final imports.k8s.ExecAction exec;
        private final java.lang.Number failureThreshold;
        private final imports.k8s.GrpcAction grpc;
        private final imports.k8s.HttpGetAction httpGet;
        private final java.lang.Number initialDelaySeconds;
        private final java.lang.Number periodSeconds;
        private final java.lang.Number successThreshold;
        private final imports.k8s.TcpSocketAction tcpSocket;
        private final java.lang.Number terminationGracePeriodSeconds;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.exec = software.amazon.jsii.Kernel.get(this, "exec", software.amazon.jsii.NativeType.forClass(imports.k8s.ExecAction.class));
            this.failureThreshold = software.amazon.jsii.Kernel.get(this, "failureThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.grpc = software.amazon.jsii.Kernel.get(this, "grpc", software.amazon.jsii.NativeType.forClass(imports.k8s.GrpcAction.class));
            this.httpGet = software.amazon.jsii.Kernel.get(this, "httpGet", software.amazon.jsii.NativeType.forClass(imports.k8s.HttpGetAction.class));
            this.initialDelaySeconds = software.amazon.jsii.Kernel.get(this, "initialDelaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.periodSeconds = software.amazon.jsii.Kernel.get(this, "periodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.successThreshold = software.amazon.jsii.Kernel.get(this, "successThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tcpSocket = software.amazon.jsii.Kernel.get(this, "tcpSocket", software.amazon.jsii.NativeType.forClass(imports.k8s.TcpSocketAction.class));
            this.terminationGracePeriodSeconds = software.amazon.jsii.Kernel.get(this, "terminationGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeoutSeconds = software.amazon.jsii.Kernel.get(this, "timeoutSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.exec = builder.exec;
            this.failureThreshold = builder.failureThreshold;
            this.grpc = builder.grpc;
            this.httpGet = builder.httpGet;
            this.initialDelaySeconds = builder.initialDelaySeconds;
            this.periodSeconds = builder.periodSeconds;
            this.successThreshold = builder.successThreshold;
            this.tcpSocket = builder.tcpSocket;
            this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        @Override
        public final imports.k8s.ExecAction getExec() {
            return this.exec;
        }

        @Override
        public final java.lang.Number getFailureThreshold() {
            return this.failureThreshold;
        }

        @Override
        public final imports.k8s.GrpcAction getGrpc() {
            return this.grpc;
        }

        @Override
        public final imports.k8s.HttpGetAction getHttpGet() {
            return this.httpGet;
        }

        @Override
        public final java.lang.Number getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        @Override
        public final java.lang.Number getPeriodSeconds() {
            return this.periodSeconds;
        }

        @Override
        public final java.lang.Number getSuccessThreshold() {
            return this.successThreshold;
        }

        @Override
        public final imports.k8s.TcpSocketAction getTcpSocket() {
            return this.tcpSocket;
        }

        @Override
        public final java.lang.Number getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        @Override
        public final java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getExec() != null) {
                data.set("exec", om.valueToTree(this.getExec()));
            }
            if (this.getFailureThreshold() != null) {
                data.set("failureThreshold", om.valueToTree(this.getFailureThreshold()));
            }
            if (this.getGrpc() != null) {
                data.set("grpc", om.valueToTree(this.getGrpc()));
            }
            if (this.getHttpGet() != null) {
                data.set("httpGet", om.valueToTree(this.getHttpGet()));
            }
            if (this.getInitialDelaySeconds() != null) {
                data.set("initialDelaySeconds", om.valueToTree(this.getInitialDelaySeconds()));
            }
            if (this.getPeriodSeconds() != null) {
                data.set("periodSeconds", om.valueToTree(this.getPeriodSeconds()));
            }
            if (this.getSuccessThreshold() != null) {
                data.set("successThreshold", om.valueToTree(this.getSuccessThreshold()));
            }
            if (this.getTcpSocket() != null) {
                data.set("tcpSocket", om.valueToTree(this.getTcpSocket()));
            }
            if (this.getTerminationGracePeriodSeconds() != null) {
                data.set("terminationGracePeriodSeconds", om.valueToTree(this.getTerminationGracePeriodSeconds()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Probe"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Probe.Jsii$Proxy that = (Probe.Jsii$Proxy) o;

            if (this.exec != null ? !this.exec.equals(that.exec) : that.exec != null) return false;
            if (this.failureThreshold != null ? !this.failureThreshold.equals(that.failureThreshold) : that.failureThreshold != null) return false;
            if (this.grpc != null ? !this.grpc.equals(that.grpc) : that.grpc != null) return false;
            if (this.httpGet != null ? !this.httpGet.equals(that.httpGet) : that.httpGet != null) return false;
            if (this.initialDelaySeconds != null ? !this.initialDelaySeconds.equals(that.initialDelaySeconds) : that.initialDelaySeconds != null) return false;
            if (this.periodSeconds != null ? !this.periodSeconds.equals(that.periodSeconds) : that.periodSeconds != null) return false;
            if (this.successThreshold != null ? !this.successThreshold.equals(that.successThreshold) : that.successThreshold != null) return false;
            if (this.tcpSocket != null ? !this.tcpSocket.equals(that.tcpSocket) : that.tcpSocket != null) return false;
            if (this.terminationGracePeriodSeconds != null ? !this.terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds) : that.terminationGracePeriodSeconds != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.exec != null ? this.exec.hashCode() : 0;
            result = 31 * result + (this.failureThreshold != null ? this.failureThreshold.hashCode() : 0);
            result = 31 * result + (this.grpc != null ? this.grpc.hashCode() : 0);
            result = 31 * result + (this.httpGet != null ? this.httpGet.hashCode() : 0);
            result = 31 * result + (this.initialDelaySeconds != null ? this.initialDelaySeconds.hashCode() : 0);
            result = 31 * result + (this.periodSeconds != null ? this.periodSeconds.hashCode() : 0);
            result = 31 * result + (this.successThreshold != null ? this.successThreshold.hashCode() : 0);
            result = 31 * result + (this.tcpSocket != null ? this.tcpSocket.hashCode() : 0);
            result = 31 * result + (this.terminationGracePeriodSeconds != null ? this.terminationGracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}
