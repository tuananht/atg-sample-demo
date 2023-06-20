import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_issue-in-executing-a-feature-9'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/issue-in-executing-a-feature-file/56584/9')

'step 2: Add visual checkpoint at Page_t_issue-in-executing-a-feature-9'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01396_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
