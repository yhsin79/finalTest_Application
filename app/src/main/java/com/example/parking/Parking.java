package com.example.parking;

public class Parking {

    String list_total_count;    //총 데이터 건수 (정상조회 시 출력됨)
    //String RESULT.CODE;       //요청결과 코드 (하단 메세지설명 참고)
    //String RESULT.MESSAGE;    //요청결과 메시지 (하단 메세지설명 참고)
    String PARKING_NAME;        //주차장명
    String ADDR;                //주소
    String PARKING_CODE;        //주차장코드
    String PARKING_TYPE;        //주차장 종류
    String PARKING_TYPE_NM;     //주차장 종류명
    String OPERATION_RULE;      //운영구분
    String OPERATION_RULE_NM;   //운영구분명
    String TEL;                 //전화번호
    String CAPACITY;            //주차 면(주차 가능 차량 수)
    String PAY_YN;              //유무료구분
    String PAY_NM;              //유무료구분명
    String NIGHT_FREE_OPEN;     //야간무료개방여부
    String NIGHT_FREE_OPEN_NM;  //야간무료개방여부명
    String WEEKDAY_BEGIN_TIME;  //평일 운영 시작시각(HHMM)
    String WEEKDAY_END_TIME;    //평일 운영 종료시각(HHMM)
    String WEEKEND_BEGIN_TIME;  //주말 운영 시작시각(HHMM)
    String WEEKEND_END_TIME;    //주말 운영 종료시각(HHMM)
    String HOLIDAY_BEGIN_TIME;  //공휴일 운영 시작시각(HHMM)
    String HOLIDAY_END_TIME;    //공휴일 운영 종료시각(HHMM)
    String SYNC_TIME;           //최종데이터 동기화 시간
    String SATURDAY_PAY_YN;     //토요일 유,무료 구분
    String SATURDAY_PAY_NM;     //토요일 유,무료 구분명
    String HOLIDAY_PAY_YN;      //공휴일 유,무료 구분
    String HOLIDAY_PAY_NM;      //공휴일 유,무료 구분명
    String FULLTIME_MONTHLY;    //월 정기권 금액
    String GRP_PARKNM;          //노상 주차장 관리그룹번호
    String RATES;               //기본 주차 요금
    String TIME_RATE;           //기본 주차 시간(분 단위)
    String ADD_RATES;           //추가 단위 요금
    String ADD_TIME_RATE;       //추가 단위 시간(분 단위)
    String BUS_RATES;           //버스 기본 주차 요금
    String BUS_TIME_RATE;       //버스 기본 주차 시간(분 단위)
    String BUS_ADD_TIME_RATE;   //버스 추가 단위 시간(분 단위)
    String BUS_ADD_RATES;       //버스 추가 단위 요금
    String DAY_MAXIMUM;         //일 최대 요금
    String LAT;                 //주차장 위치 좌표 위도
    String LNG;                 //주차장 위치 좌표 경도
    String ASSIGN_CODE;         //배정코드
    String ASSIGN_CODE_NM;      //배정코드명


}
