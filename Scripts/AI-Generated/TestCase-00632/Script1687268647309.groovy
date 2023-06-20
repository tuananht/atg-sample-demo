import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-do-i-merge-a-feature-branch-to-the-master-using-git'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-do-i-merge-a-feature-branch-to-the-master-using-git/26213')

'step 2: Add visual checkpoint at Page_t_how-do-i-merge-a-feature-branch-to-the-master-using-git'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00632_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
