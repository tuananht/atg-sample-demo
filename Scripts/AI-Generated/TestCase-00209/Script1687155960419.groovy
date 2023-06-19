import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_web-service-tests-rest-api-xml-response-problem-with-verification-getresponsebodycontent-does-not-contain-all-of-the-responses-body'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/web-service-tests-rest-api-xml-response-problem-with-verification-getresponsebodycontent-does-not-contain-all-of-the-responses-body/58016')

'step 2: Add visual checkpoint at Page_t_web-service-tests-rest-api-xml-response-problem-with-verification-getresponsebodycontent-does-not-contain-all-of-the-responses-body'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00209_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
