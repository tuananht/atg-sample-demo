import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-find-and-click-elements-in-my-calendar'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-find-and-click-elements-in-my-calendar/34713')

'step 2: At Page_t_how-can-i-find-and-click-elements-in-my-calendar click on hyperlink_europe1_discourse_3aa67b49f50790d242361'

testObj = findTestObject('Object Repository/Page_t_how-can-i-find-and-click-elements-in-my-calendar/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-can-i-find-and-click-elements-in-my-calendar/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_t_how-can-i-find-and-click-elements-in-my-calendar click on button_object'

testObj = findTestObject('Object Repository/Page_t_test-suite-passes-in-katalon-studio-but-has-multiple-errors-when-run-using-jenkins/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/test-suite-passes-in-katalon-studio-but-has-multiple-errors-when-run-using-jenkins/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_t_how-can-i-find-and-click-elements-in-my-calendar'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00021_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
