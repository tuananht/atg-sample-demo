import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_case-studies_system-automation'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/case-studies/system-automation')

'step 2: Add visual checkpoint at Page_case-studies_system-automation'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00157_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
