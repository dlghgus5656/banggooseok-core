package kr.banggooseok.aries.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class IndyProofReqPredSpec {

    @SerializedName("name")
    public String name;

    @SerializedName("non_revoked")
    public V20PresRequestByFormat.Indy.NonRevoked nonRevoked;

    @SerializedName("p_type")
    public String pType;

    @SerializedName("p_value")
    public int pValue;

    @SerializedName("restrictions")
    public Map<String, Object> restrictions;

}
