package pl.warkoczewski.UdemyDeepDiveJava.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum  SortType {
    @JsonProperty("BUBBLE")BUBBLE,
    @JsonProperty("INSERTION")INSERTION,
    @JsonProperty("SELECTION")SELECTION,
    @JsonProperty("SHELL")SHELL,
}
