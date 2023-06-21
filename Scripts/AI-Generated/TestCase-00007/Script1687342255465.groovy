import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-change-the-default-browser-in-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-change-the-default-browser-in-katalon-studio/6642')

'step 2: At Page_t_how-to-change-the-default-browser-in-katalon-studio click on hyperlink_ --> navigate to Page_home'

testObj = findTestObject('Object Repository/Page_t_how-to-change-the-default-browser-in-katalon-studio/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/how-to-change-the-default-browser-in-katalon-studio/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_home click on button_search_button'

testObj = findTestObject('Object Repository/Page_home/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_home click on div_ember4 --> navigate to Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know'

testObj = findTestObject('Object Repository/Page_home/div_object_50')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_t_help-my-test-keeps-passing-but-should-fail-strange-i-know'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00007_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
