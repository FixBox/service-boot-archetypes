Use this package components  like  :

@Data
@Component
public class UrlComponent {
    @Value("${eos.ws.server}")
    String eosWsServer;
    @Value("${eos.ws.server.port}")
    String eosWsServerPort;
    @Value("${eos.url.authentication}")
    String eosUrlAuthentication;
    @Value("${eos.url.log.out}")
    String eosUrlLogOut;
    @Value("${eos.url.get.environments}")
    String eosUrlGetEnvironment;
    @Value("${eos.url.get.documents}")
    String eosUrlGetDocuments;
    @Value("${eos.url.get.report.content}")
    String eosUrlGetReportContent ;
    @Value("${eos.url.restore.document}")
    String eosUrlRestoreDocument;
}
