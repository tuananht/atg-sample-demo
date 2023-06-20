import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-add-days-years-to-current-date-using-java-time-localdatetime'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-add-days-years-to-current-date-using-java-time-localdatetime/60002')

'step 2: At Page_t_how-to-add-days-years-to-current-date-using-java-time-localdatetime click on div_object'

testObj = findTestObject('Object Repository/Page_t_how-to-add-days-years-to-current-date-using-java-time-localdatetime/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-add-days-years-to-current-date-using-java-time-localdatetime/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_how-to-add-days-years-to-current-date-using-java-time-localdatetime click on code_object'

testObj = findTestObject('Object Repository/Page_t_how-to-add-days-years-to-current-date-using-java-time-localdatetime/code_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-add-days-years-to-current-date-using-java-time-localdatetime/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_t_how-to-add-days-years-to-current-date-using-java-time-localdatetime'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00009_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
