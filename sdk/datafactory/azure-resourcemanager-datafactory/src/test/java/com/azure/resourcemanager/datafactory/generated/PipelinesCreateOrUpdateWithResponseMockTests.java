// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import com.azure.resourcemanager.datafactory.models.PipelineFolder;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import com.azure.resourcemanager.datafactory.models.PipelineResource;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.azure.resourcemanager.datafactory.models.VariableType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PipelinesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"okft\",\"activities\":[{\"type\":\"Activity\",\"name\":\"ezplnzvrhg\",\"description\":\"eelkv\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"kwgsqosrpcxw\",\"dependencyConditions\":[]},{\"activity\":\"hkljktujf\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"qfryketwrzx\",\"value\":\"datamiy\"},{\"name\":\"fkgmyq\",\"value\":\"datajfjypp\"},{\"name\":\"xfubkf\",\"value\":\"datatvlwyety\"},{\"name\":\"nhispacivanl\",\"value\":\"datapspnjlopoang\"}],\"tbm\":\"dataaixrbwbkrsmkeiun\",\"fc\":\"datadzfoxdtzzmcrmh\",\"b\":\"dataizxuiyuzufdm\"},{\"type\":\"Activity\",\"name\":\"ygnfljvra\",\"description\":\"oecozfauhnxxdyah\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"k\",\"dependencyConditions\":[]},{\"activity\":\"mhax\",\"dependencyConditions\":[]},{\"activity\":\"wjimlfrk\",\"dependencyConditions\":[]},{\"activity\":\"ynmm\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"bxoe\",\"value\":\"datahordcc\"},{\"name\":\"kr\",\"value\":\"datazczlvql\"},{\"name\":\"ca\",\"value\":\"dataphsarty\"},{\"name\":\"qqwdgyshpvv\",\"value\":\"datagvqrwrchwdx\"}],\"fjjxoxweuoklwt\":\"dataqq\"},{\"type\":\"Activity\",\"name\":\"e\",\"description\":\"ndheocjc\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"wu\",\"dependencyConditions\":[]},{\"activity\":\"verplhfwqdvdqcoh\",\"dependencyConditions\":[]},{\"activity\":\"wzy\",\"dependencyConditions\":[]}],\"userProperties\":[{\"name\":\"lt\",\"value\":\"datambhlhyqgfim\"},{\"name\":\"lr\",\"value\":\"datadqwpudvup\"},{\"name\":\"izztkl\",\"value\":\"datashdeehtjmdefkphs\"},{\"name\":\"kivyaf\",\"value\":\"datapcnnpjulpwwmxwl\"}],\"zjazepbjukikd\":\"datarkf\",\"unsvsjo\":\"datavruxmpnugujiwi\",\"lt\":\"dataanxs\"}],\"parameters\":{\"enpybuskvjb\":{\"type\":\"Int\",\"defaultValue\":\"dataqxruqrobk\"},\"kkgawnaeoeuidh\":{\"type\":\"Bool\",\"defaultValue\":\"dataqudxvjrndbinqq\"}},\"variables\":{\"xeclwl\":{\"type\":\"String\",\"defaultValue\":\"dataitnzpfdoetetisk\"},\"nfmxomupdqpcxiv\":{\"type\":\"Array\",\"defaultValue\":\"datar\"}},\"concurrency\":920981998,\"annotations\":[\"datamefjpoellyvbvxl\",\"dataltrztr\",\"dataoyrjvrxyrxhfrsyc\"],\"runDimensions\":{\"hlnbawffrzgeobz\":\"dataefmqhtrzlvfncp\",\"grojpnxz\":\"dataxzraihl\",\"yysycey\":\"datarc\"},\"folder\":{\"name\":\"lxhymc\"},\"policy\":{\"elapsedTimeMetric\":{\"duration\":\"datapymroyygt\"}}},\"name\":\"mpwzlbqdxvxdfkdw\",\"type\":\"mnoecfjw\",\"etag\":\"iupgmdszwrfdj\",\"qfi\":\"datajsmdrecrrbkm\",\"id\":\"goapxdmxwetkj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PipelineResource response = manager.pipelines()
            .define("amnxzduyd")
            .withExistingFactory("bhuai", "dxquow")
            .withDescription("vwoclmdcoqwdmegk")
            .withActivities(Arrays.asList(
                new Activity().withName("uguvnwcvlmyrw")
                    .withDescription("rtubemptxm")
                    .withState(ActivityState.INACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                    .withDependsOn(Arrays.asList(
                        new ActivityDependency().withActivity("mmwpqcdmfrjqfe")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("gdkxiprrvfy")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("vkmom")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf())))
                    .withUserProperties(
                        Arrays.asList(new UserProperty().withName("evqbcdjlnnvhb").withValue("datajutupgmmtit"),
                            new UserProperty().withName("poqqakpbkwqavxlj").withValue("dataybgxxm"),
                            new UserProperty().withName("drgxhrtans").withValue("databoiyqi")))
                    .withAdditionalProperties(
                        mapOf("vfwyoqjtt", "datajhvkttusyxz", "ftjjmtk", "dataiv", "type", "Activity")),
                new Activity().withName("gdgfjvitdp")
                    .withDescription("oesx")
                    .withState(ActivityState.INACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                    .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("caspwvglaxvn")
                        .withDependencyConditions(Arrays.asList())
                        .withAdditionalProperties(mapOf())))
                    .withUserProperties(
                        Arrays.asList(new UserProperty().withName("atwxqaggbirzj").withValue("dataaicyuplmdhuu"),
                            new UserProperty().withName("tiecnpka").withValue("datatjqjtoeaug"),
                            new UserProperty().withName("osrywpfcqle").withValue("dataiafsizdec")))
                    .withAdditionalProperties(mapOf("nphgs", "datamdcolwquxrrjud", "bdpaoij", "datallicovvdcobf",
                        "cvnoqwg", "dataqtwfmvpsvwwt", "type", "Activity")),
                new Activity().withName("qgf")
                    .withDescription("trvvhxjfkpu")
                    .withState(ActivityState.ACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                    .withDependsOn(Arrays.asList(
                        new ActivityDependency().withActivity("l")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("xwnircmodws")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("hzlamdqgav")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf())))
                    .withUserProperties(
                        Arrays.asList(new UserProperty().withName("wkjambfsxsr").withValue("datajfapiodsn"),
                            new UserProperty().withName("yezwjqb").withValue("datacxlg"),
                            new UserProperty().withName("uxo").withValue("datamjxqintjhvcoro")))
                    .withAdditionalProperties(mapOf("kwwyfsq", "datahpguji", "lotknbruszqmu", "datasjegohpwnrm",
                        "svcxazvrmu", "dataa", "ygyqgvo", "dataudzipzkkleazk", "type", "Activity")),
                new Activity().withName("mefsxmdmlowe")
                    .withDescription("xpwfvtwgnm")
                    .withState(ActivityState.ACTIVE)
                    .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                    .withDependsOn(Arrays.asList(
                        new ActivityDependency().withActivity("omjsfkdvbhc")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf()),
                        new ActivityDependency().withActivity("hinjnwpiv")
                            .withDependencyConditions(Arrays.asList())
                            .withAdditionalProperties(mapOf())))
                    .withUserProperties(Arrays.asList(new UserProperty().withName("baj").withValue("dataec"),
                        new UserProperty().withName("gwkzu").withValue("dataxsrmadakjsypuvyv"),
                        new UserProperty().withName("bkkekldxclqjn").withValue("datahotwq")))
                    .withAdditionalProperties(
                        mapOf("y", "datarzlimzsutmsmdibz", "type", "Activity", "xuvdcwtnzfleghnf", "dataempsayk"))))
            .withParameters(mapOf("yrsravsscblsxms",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datahsfjqxlbclvpgbu"),
                "ixwx",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datagdtuzclfbvvuyoil"),
                "xs", new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datauuvbbh"),
                "midvicdqufjahuc",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datalxwlmxzoibipktbl")))
            .withVariables(mapOf("trfdipss",
                new VariableSpecification().withType(VariableType.STRING).withDefaultValue("datacklthsuasnxdhlov")))
            .withConcurrency(1782839703)
            .withAnnotations(Arrays.asList("databydryysvex", "datazs", "databfnkj"))
            .withRunDimensions(mapOf("uah", "dataynpbirltz", "sdtysnlxw", "datalxcdpj"))
            .withFolder(new PipelineFolder().withName("ez"))
            .withPolicy(new PipelinePolicy()
                .withElapsedTimeMetric(new PipelineElapsedTimeMetricPolicy().withDuration("datajjzcxtzkoloosc")))
            .withIfMatch("ezapuun")
            .create();

        Assertions.assertEquals("goapxdmxwetkj", response.id());
        Assertions.assertEquals("okft", response.description());
        Assertions.assertEquals("ezplnzvrhg", response.activities().get(0).name());
        Assertions.assertEquals("eelkv", response.activities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, response.activities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, response.activities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("kwgsqosrpcxw", response.activities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals("qfryketwrzx", response.activities().get(0).userProperties().get(0).name());
        Assertions.assertEquals(ParameterType.INT, response.parameters().get("enpybuskvjb").type());
        Assertions.assertEquals(VariableType.STRING, response.variables().get("xeclwl").type());
        Assertions.assertEquals(920981998, response.concurrency());
        Assertions.assertEquals("lxhymc", response.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
