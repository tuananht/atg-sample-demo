import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset/28942')

'step 2: At Page_t_test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset click on div_object'

testObj = findTestObject('Object Repository/Page_t_test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_test-execution-throught-suite-displays-org-openqa-selenium-webdriverexception-java-net-socketexception-connection-reset'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00035_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
