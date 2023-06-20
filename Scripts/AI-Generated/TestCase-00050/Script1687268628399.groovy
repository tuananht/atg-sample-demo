import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_need-a-solution-to-send-text-on-text-box-of-flutter-app'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/need-a-solution-to-send-text-on-text-box-of-flutter-app/42836')

'step 2: At Page_t_need-a-solution-to-send-text-on-text-box-of-flutter-app click on div_object --> navigate to Page_t_need-a-solution-to-send-text-on-text-box-of-flutter-2'

testObj = findTestObject('Object Repository/Page_t_need-a-solution-to-send-text-on-text-box-of-flutter-app/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/t/need-a-solution-to-send-text-on-text-box-of-flutter-app/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_t_need-a-solution-to-send-text-on-text-box-of-flutter-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00050_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
