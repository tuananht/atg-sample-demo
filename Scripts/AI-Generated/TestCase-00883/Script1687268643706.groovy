import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_facing-several-issues-trying-to-consume-a-github-package-i-published'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/facing-several-issues-trying-to-consume-a-github-package-i-published/88848')

'step 2: Add visual checkpoint at Page_t_facing-several-issues-trying-to-consume-a-github-package-i-published'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00883_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
