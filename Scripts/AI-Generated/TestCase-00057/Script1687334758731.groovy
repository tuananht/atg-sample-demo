import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_demo-request_salesforce-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/demo-request/salesforce-testing')

'step 2: Add visual checkpoint at Page_demo-request_salesforce-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00057_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
