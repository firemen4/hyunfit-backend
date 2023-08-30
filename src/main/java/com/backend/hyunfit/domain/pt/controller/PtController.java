package com.backend.hyunfit.domain.pt.controller;

import com.backend.hyunfit.domain.auth.dto.AuthDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;



@Tag(name="Pt Contorller", description = "pt관련 컨트롤러")
public interface PtController {
    @Operation(summary="Pt의 개인레슨을 등록하는 과정입니다", description = "개인 레슨을 등록하는 과정 중에서 비어있는 값이 있으면 다음과 같은 에러를 반환합니다")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
            @ApiResponse(responseCode = "404", description = "NOT FOUND"),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR")
    })
    ResponseEntity<AuthDTO> createMemberAuth(AuthDTO authVO);

}