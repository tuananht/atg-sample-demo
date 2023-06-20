import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_web-service-tests-rest-api-xml-response-problem-with-verification-getresponsebodycontent-does-not-contain-all-of-the-responses-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/web-service-tests-rest-api-xml-response-problem-with-verification-getresponsebodycontent-does-not-contain-all-of-the-responses-body/58016/2')

'step 2: Add visual checkpoint at Page_t_web-service-tests-rest-api-xml-response-problem-with-verification-getresponsebodycontent-does-not-contain-all-of-the-responses-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01282_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
