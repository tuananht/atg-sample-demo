import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_freemium'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/freemium')

'step 2: At Page_freemium click on div_object'

testObj = findTestObject('Object Repository/Page_freemium/div_object_78')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/freemium(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_freemium click on hyperlink_api_testing --> navigate to Page_api-testing'

testObj = findTestObject('Object Repository/Page_freemium/hyperlink_object_17')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/freemium(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_api-testing click on hyperlink_sign_in --> navigate to Page_sign-in'

testObj = findTestObject('Object Repository/Page_api-testing/hyperlink_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/api-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_sign-in'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00006_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
