package org.wso2.carbon.identity.workflow.impl.model;

import org.wso2.carbon.identity.workflow.impl.bean.BPSProfile;
import org.wso2.carbon.identity.workflow.mgt.bean.Workflow;
import org.wso2.carbon.identity.workflow.mgt.bean.WorkflowRequest;
import org.wso2.carbon.identity.xds.common.constant.XDSWrapper;

public class WorkflowXDSWrapper implements XDSWrapper {

    private BPSProfile bpsProfile;
    private String profileName;
    private WorkflowRequest workflowRequest;
    private Workflow workflow;
    private String timestamp;

    public WorkflowXDSWrapper(WorkflowXDSWrapperBuilder builder) {

        this.bpsProfile = builder.bpsProfile;
        this.profileName = builder.profileName;
        this.workflowRequest = builder.workflowRequest;
        this.workflow = builder.workflow;
        this.timestamp = builder.timestamp;
    }

    public BPSProfile getBpsProfile() {
        return bpsProfile;
    }

    public String getProfileName() {
        return profileName;
    }

    public WorkflowRequest getWorkflowRequest() {
        return workflowRequest;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public static class WorkflowXDSWrapperBuilder {

        private BPSProfile bpsProfile;
        private String profileName;
        private WorkflowRequest workflowRequest;
        private Workflow workflow;
        private String timestamp;

        public WorkflowXDSWrapperBuilder setBpsProfile(BPSProfile bpsProfile) {
            this.bpsProfile = bpsProfile;
            return this;
        }

        public WorkflowXDSWrapperBuilder setProfileName(String profileName) {
            this.profileName = profileName;
            return this;
        }

        public WorkflowXDSWrapperBuilder setWorkflowRequest(WorkflowRequest workflowRequest) {
            this.workflowRequest = workflowRequest;
            return this;
        }

        public WorkflowXDSWrapperBuilder setWorkflow(Workflow workflow) {
            this.workflow = workflow;
            return this;
        }

        public WorkflowXDSWrapper build() {

            this.timestamp = String.valueOf(System.currentTimeMillis());
            return new WorkflowXDSWrapper(this);
        }
    }
}
