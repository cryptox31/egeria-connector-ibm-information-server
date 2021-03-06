/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.base;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeName;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.ItemList;
import java.util.List;

/**
 * POJO for the {@code information_governance_policy} asset type in IGC, displayed as '{@literal Information Governance Policy}' in the IGC UI.
 * <br><br>
 * (this code has been created based on out-of-the-box IGC metadata types.
 *  If modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.EXISTING_PROPERTY, property="_type", visible=true, defaultImpl=InformationGovernancePolicy.class)
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("information_governance_policy")
public class InformationGovernancePolicy extends InformationAsset {

    /**
     * Valid values are:
     * <ul>
     *   <li>PUBLISHED (displayed in the UI as 'PUBLISHED')</li>
     *   <li>DRAFT (displayed in the UI as 'DRAFT')</li>
     * </ul>
     */
    @JsonProperty("glossary_type")
    protected String glossaryType;

    @JsonProperty("information_governance_rules")
    protected ItemList<InformationGovernanceRule> informationGovernanceRules;

    @JsonProperty("language")
    protected String language;

    @JsonProperty("parent_policy")
    protected InformationGovernancePolicy parentPolicy;

    @JsonProperty("subpolicies")
    protected ItemList<InformationGovernancePolicy> subpolicies;

    @JsonProperty("translations")
    protected ItemList<InformationGovernancePolicy> translations;

    /**
     * Valid values are:
     * <ul>
     *   <li>DRAFT (displayed in the UI as 'DRAFT')</li>
     *   <li>WAITING_APPROVAL (displayed in the UI as 'WAITING_APPROVAL')</li>
     *   <li>APPROVED (displayed in the UI as 'APPROVED')</li>
     * </ul>
     */
    @JsonProperty("workflow_current_state")
    protected List<String> workflowCurrentState;

    /**
     * Valid values are:
     * <ul>
     *   <li>DRAFT (displayed in the UI as 'DRAFT')</li>
     *   <li>WAITING_APPROVAL (displayed in the UI as 'WAITING_APPROVAL')</li>
     *   <li>APPROVED (displayed in the UI as 'APPROVED')</li>
     * </ul>
     */
    @JsonProperty("workflow_stored_state")
    protected List<String> workflowStoredState;

    /**
     * Retrieve the {@code glossary_type} property (displayed as '{@literal Glossary Type}') of the object.
     * @return {@code String}
     */
    @JsonProperty("glossary_type")
    public String getGlossaryType() { return this.glossaryType; }

    /**
     * Set the {@code glossary_type} property (displayed as {@code Glossary Type}) of the object.
     * @param glossaryType the value to set
     */
    @JsonProperty("glossary_type")
    public void setGlossaryType(String glossaryType) { this.glossaryType = glossaryType; }

    /**
     * Retrieve the {@code information_governance_rules} property (displayed as '{@literal Information Governance Rules}') of the object.
     * @return {@code ItemList<InformationGovernanceRule>}
     */
    @JsonProperty("information_governance_rules")
    public ItemList<InformationGovernanceRule> getInformationGovernanceRules() { return this.informationGovernanceRules; }

    /**
     * Set the {@code information_governance_rules} property (displayed as {@code Information Governance Rules}) of the object.
     * @param informationGovernanceRules the value to set
     */
    @JsonProperty("information_governance_rules")
    public void setInformationGovernanceRules(ItemList<InformationGovernanceRule> informationGovernanceRules) { this.informationGovernanceRules = informationGovernanceRules; }

    /**
     * Retrieve the {@code language} property (displayed as '{@literal Language}') of the object.
     * @return {@code String}
     */
    @JsonProperty("language")
    public String getLanguage() { return this.language; }

    /**
     * Set the {@code language} property (displayed as {@code Language}) of the object.
     * @param language the value to set
     */
    @JsonProperty("language")
    public void setLanguage(String language) { this.language = language; }

    /**
     * Retrieve the {@code parent_policy} property (displayed as '{@literal Parent Policy}') of the object.
     * @return {@code InformationGovernancePolicy}
     */
    @JsonProperty("parent_policy")
    public InformationGovernancePolicy getParentPolicy() { return this.parentPolicy; }

    /**
     * Set the {@code parent_policy} property (displayed as {@code Parent Policy}) of the object.
     * @param parentPolicy the value to set
     */
    @JsonProperty("parent_policy")
    public void setParentPolicy(InformationGovernancePolicy parentPolicy) { this.parentPolicy = parentPolicy; }

    /**
     * Retrieve the {@code subpolicies} property (displayed as '{@literal Subpolicies}') of the object.
     * @return {@code ItemList<InformationGovernancePolicy>}
     */
    @JsonProperty("subpolicies")
    public ItemList<InformationGovernancePolicy> getSubpolicies() { return this.subpolicies; }

    /**
     * Set the {@code subpolicies} property (displayed as {@code Subpolicies}) of the object.
     * @param subpolicies the value to set
     */
    @JsonProperty("subpolicies")
    public void setSubpolicies(ItemList<InformationGovernancePolicy> subpolicies) { this.subpolicies = subpolicies; }

    /**
     * Retrieve the {@code translations} property (displayed as '{@literal Translations}') of the object.
     * @return {@code ItemList<InformationGovernancePolicy>}
     */
    @JsonProperty("translations")
    public ItemList<InformationGovernancePolicy> getTranslations() { return this.translations; }

    /**
     * Set the {@code translations} property (displayed as {@code Translations}) of the object.
     * @param translations the value to set
     */
    @JsonProperty("translations")
    public void setTranslations(ItemList<InformationGovernancePolicy> translations) { this.translations = translations; }

    /**
     * Retrieve the {@code workflow_current_state} property (displayed as '{@literal Workflow Current State}') of the object.
     * @return {@code List<String>}
     */
    @JsonProperty("workflow_current_state")
    public List<String> getWorkflowCurrentState() { return this.workflowCurrentState; }

    /**
     * Set the {@code workflow_current_state} property (displayed as {@code Workflow Current State}) of the object.
     * @param workflowCurrentState the value to set
     */
    @JsonProperty("workflow_current_state")
    public void setWorkflowCurrentState(List<String> workflowCurrentState) { this.workflowCurrentState = workflowCurrentState; }

    /**
     * Retrieve the {@code workflow_stored_state} property (displayed as '{@literal Workflow Stored State}') of the object.
     * @return {@code List<String>}
     */
    @JsonProperty("workflow_stored_state")
    public List<String> getWorkflowStoredState() { return this.workflowStoredState; }

    /**
     * Set the {@code workflow_stored_state} property (displayed as {@code Workflow Stored State}) of the object.
     * @param workflowStoredState the value to set
     */
    @JsonProperty("workflow_stored_state")
    public void setWorkflowStoredState(List<String> workflowStoredState) { this.workflowStoredState = workflowStoredState; }

}
