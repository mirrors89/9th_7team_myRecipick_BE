package com.myrecipick.api.controller.menu.dto.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.myrecipick.api.controller.ServiceResponse;
import com.myrecipick.core.domain.menu.Menu;
import java.util.List;
import org.springframework.http.HttpStatus;

@JsonInclude(Include.NON_NULL)
public class GetMenusResponse extends ServiceResponse {

    @JsonInclude(Include.NON_NULL)
    private List<Menu> data;

    public GetMenusResponse() {
    }

    public GetMenusResponse(HttpStatus status, String message,
                            List<Menu> data) {
        super(status, message);
        this.data = data;
    }

    public static GetMenusResponse ok(List<Menu> data) {
        GetMenusResponse getOptionGroupResponse = new GetMenusResponse();
        getOptionGroupResponse.status = HttpStatus.OK;
        getOptionGroupResponse.data = data;

        return getOptionGroupResponse;
    }

    public List<Menu> getData() {
        return data;
    }
}
